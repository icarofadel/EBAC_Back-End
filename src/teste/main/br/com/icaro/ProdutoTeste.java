package br.com.icaro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import br.com.icaro.dao.ProdutoDAO;
import br.com.icaro.dao.IProdutoDAO;
import br.com.icaro.domain.Produto;

public class ProdutoTeste {
	
	private IProdutoDAO produtoDAO;
	
	@Test
	public void cadastrarProdutoTest() throws Exception {
		produtoDAO = new ProdutoDAO();
		
		Produto produto = new Produto();
		produto.setNome("Controle PS5");
		produto.setValor(400.00);
		Integer qtd = produtoDAO.cadastrarProd(produto);
		assertTrue(qtd == 1);
		
		Produto produtoBD = produtoDAO.consultarProd(400.00);
		assertNotNull(produtoBD);
		assertEquals(produto.getValor(), produtoBD.getValor());
		assertEquals(produto.getNome(), produtoBD.getNome());
		
		Integer qtdDel = produtoDAO.excluir(produtoBD);
		assertNotNull(qtdDel);
	}
	
	@Test
	public void buscarProdutoTest() throws Exception {
		produtoDAO = new ProdutoDAO();
		
		Produto produto = new Produto();
		produto.setValor(400.00);
		produto.setNome("Controle PS5");
		Integer contProd = produtoDAO.cadastrarProd(produto);
		assertTrue(contProd == 1);
		
		Produto produtoBD = produtoDAO.consultarProd(400.00);
		assertNotNull(produtoBD);
		assertEquals(produto.getValor(), produto.getValor());
		assertEquals(produto.getNome(), produto.getNome());
		
		Integer qtdDel = produtoDAO.excluir(produtoBD);
		assertTrue(qtdDel == 1);
	}

	@Test
	public void excluirProdutoTest() throws Exception {
		produtoDAO = new ProdutoDAO();
		
		Produto produto = new Produto();
		produto.setValor(400.00);
		produto.setNome("Controle PS5");
		Integer contProd = produtoDAO.cadastrarProd(produto);
		assertTrue(contProd == 1);
		
		Produto produtoBD = produtoDAO.consultarProd(400.00);
		assertNotNull(produtoBD);
		assertEquals(produto.getValor(), produtoBD.getValor());
		assertEquals(produto.getNome(), produtoBD.getNome());
		
		Integer qtdDel = produtoDAO.excluir(produtoBD);
		assertTrue(qtdDel == 1);
	}
	
	@Test
	public void buscarTodosProdutosTest() throws Exception {
		produtoDAO = new ProdutoDAO();
		
		Produto produto = new Produto();
		produto.setValor(500.00);
		produto.setNome("Controle PS5");
		Integer contProd = produtoDAO.cadastrarProd(produto);
		assertTrue(contProd == 1);
		
		Produto produtos = new Produto();
		produtos.setValor(500.00);
		produtos.setNome("Teste");
		Integer contProd2 = produtoDAO.cadastrarProd(produtos);
		assertTrue(contProd2 == 1);
		
		List<Produto> list = produtoDAO.buscarTodosProdutosTest();
		assertNotNull(list);
		assertEquals(2, list.size());
		
		int prodDel = 0;
		for (Produto cli : list) {
			produtoDAO.excluir(cli);
			prodDel++;
		}
		assertEquals(list.size(), prodDel);
		
		list = produtoDAO.buscarTodosProdutosTest();
		assertEquals(list.size(), 0);
	}
	
	@Test
	public void atualizarProdutoTest() throws Exception {
		produtoDAO = new ProdutoDAO();
		
		Produto produto = new Produto();
		produto.setValor(100.00);
		produto.setNome("Controle PS5");
		Integer contProd = produtoDAO.cadastrarProd(produto);
		assertTrue(contProd == 1);
		
		Produto produtoBD = produtoDAO.consultarProd(100.00);
		assertNotNull(produtoBD);
		assertEquals(produto.getValor(), produtoBD.getValor());
		assertEquals(produto.getNome(), produtoBD.getNome());
		
		produtoBD.setValor(200.00);
		produtoBD.setNome("Outro produto");
		Integer prodUpdate = produtoDAO.atualizarProd(produtoBD);
		assertTrue(prodUpdate == 1);
		
		Produto produtoBD1 = produtoDAO.consultarProd(100.00);
		assertNull(produtoBD1);
		
		Produto produtoBD2 = produtoDAO.consultarProd(200.00);
		assertNotNull(produtoBD2);
		assertEquals(produtoBD.getId(), produtoBD2.getId());
		assertEquals(produtoBD.getValor(), produtoBD2.getValor());
		assertEquals(produtoBD.getNome(), produtoBD2.getNome());
		
		List<Produto> list = produtoDAO.buscarTodosProdutosTest();
		for (Produto cli : list) {
			produtoDAO.excluir(cli);
		}
	}
}
