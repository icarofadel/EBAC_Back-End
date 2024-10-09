/**
 * 
 */
package br.com.icaro;

import static org.junit.Assert.assertNotNull;

import java.util.List;
import org.junit.After;
import org.junit.Test;

import br.com.icaro.dao.ProdutoDAO;
import br.com.icaro.dao.IProdutoDao;
import br.com.icaro.domain.Produto;

public class ProdutoTest {

	private IProdutoDao produtoDao;
	
	public ProdutoTest() {
		produtoDao = new ProdutoDAO();
	}
	
	@After
	public void end() {
		List<Produto> list = produtoDao.buscarTodos();
		list.forEach(cli -> produtoDao.excluir(cli));
	}

	@Test
	public void cadastrar() {
		Produto produto = new Produto();
		produto.setCodigo("1");
		produto.setValor(100.00);
		produto.setNome("Controle de TV");
		produto = produtoDao.cadastrar(produto);
		
		assertNotNull(produto);
		assertNotNull(produto.getId());
	}

}