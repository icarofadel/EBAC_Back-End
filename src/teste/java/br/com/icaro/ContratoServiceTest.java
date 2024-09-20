package br.com.icaro;

import org.junit.Assert;
import org.junit.Test;

import dao.ContratoDao;
import dao.IContratoDao;
import mock.ContratoDaoMock;
import service.ContratoService;
import service.IContratoService;

public class ContratoServiceTest {
	
	@Test
	public void salvarTest() {
		IContratoDao Dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(Dao);
		String retorno = service.salvar();
		Assert.assertEquals("Sucesso", retorno);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroSalvarTest() {
		IContratoDao Dao = new ContratoDao();
		IContratoService service = new ContratoService(Dao);
		String retorno = service.salvar();
		Assert.assertEquals("Sucesso", retorno);
	}
	
	// Criar métodos de buscar, excluir e atualizar
	
	// Testes de buscar
	
	@Test
	public void buscarTest() {
		IContratoDao Dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(Dao);
		String retorno = service.buscar();
		Assert.assertEquals("Buscou no banco de dados", retorno);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroBuscarTest() {
		IContratoDao Dao = new ContratoDao();
		IContratoService service = new ContratoService(Dao);
		String retorno = service.buscar();
		Assert.assertEquals("Não funciona sem o banco", retorno);
	}
	
	// Testes de excluir
	
	@Test
	public void excluirTest() {
		IContratoDao Dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(Dao);
		String retorno = service.excluir();
		Assert.assertEquals("Excluiu do banco de dados", retorno);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroExcluirTest() {
		IContratoDao Dao = new ContratoDao();
		IContratoService service = new ContratoService(Dao);
		String retorno = service.excluir();
		Assert.assertEquals("Não é possivel excluir sem o banco de dados", retorno);
	}
	
	// Testes de atualizar
	
	@Test
	public void atualizarTest() {
		IContratoDao Dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(Dao);
		String retorno = service.atualizar();
		Assert.assertEquals("Atualizou no banco de dados", retorno);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroAtualizarTest() {
		IContratoDao Dao = new ContratoDao();
		IContratoService service = new ContratoService(Dao);
		String retorno = service.atualizar();
		Assert.assertEquals("Não é possivel atualizar sem o banco de dados", retorno);
	}
}
