package br.com.icaro;

import org.junit.Test;
import org.junit.Assert;

import dao.ClienteDao;
import dao.ClienteDaoMock;
import service.ClienteService;
import dao.IClienteDao;

public class ClienteServiceTest {
	
	@Test
	public void salvarTest() {
		ClienteDaoMock mockDao = new ClienteDaoMock();
		ClienteService service = new ClienteService(mockDao);
		String retorno = service.salvar();
		Assert.assertEquals("Sucesso", retorno);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroSalvarTest() {
		IClienteDao mockDao = new ClienteDao();
		ClienteService service = new ClienteService(mockDao);
		String retorno = service.salvar();
		Assert.assertEquals("Sucesso", retorno);
	}
}
