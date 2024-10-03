/**
 * 
 */
package br.com.icaro;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.icaro.dao.IProdutoDAO;
import br.com.icaro.dao.ProdutoDaoMock;
import br.com.icaro.domain.Produto;
import br.com.icaro.exceptions.DAOException;
import br.com.icaro.exceptions.TipoChaveNaoEncontradaException;
import br.com.icaro.services.IProdutoService;
import br.com.icaro.services.ProdutoService;

/**
 * @author icaro
 *
 */
public class ProdutoServiceTest {

	private IProdutoService produtoService;
	
	private Produto produto;
	
	public ProdutoServiceTest() {
		IProdutoDAO dao = new ProdutoDaoMock();
		produtoService = new ProdutoService(dao);
	}
	
	@Before
	public void init() {
		produto = new Produto();
		produto.setCodigo("A1");
		produto.setDescricao("Produto 1");
		produto.setNome("Produto 1");
		produto.setValor(BigDecimal.TEN);
		produto.setCor("Branco");
	}
	
	@Test
	public void pesquisar() throws DAOException {
		Produto produtor = this.produtoService.consultar(produto.getCodigo());
		Assert.assertNotNull(produtor);
	}
	
	@Test
	public void salvar() throws TipoChaveNaoEncontradaException, DAOException {
		Boolean retorno = produtoService.cadastrar(produto);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluir() throws DAOException {
		produtoService.excluir(produto.getCodigo());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException, DAOException {
		produto.setNome("Icaro Natã");
		produtoService.alterar(produto);
		
		Assert.assertEquals("Icaro Natã", produto.getNome());
	}
}
