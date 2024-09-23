package br.com.icaro;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.icaro.dao.ClienteDaoMock;
import br.com.icaro.dao.IClienteDAO;
import br.com.icaro.domain.Cliente;

public class ClienteDAOTest {
	
	private IClienteDAO clienteDao;
	
	private Cliente cliente;
	
	public ClienteDAOTest() {
		clienteDao = new ClienteDaoMock();
	}
	
	@Before
	public void init() {
		//Criando cliente
		cliente = new Cliente();
		cliente.setCpf(49140092852L);
		cliente.setNome("Icaro");
		cliente.setTel(11949268848L);
		cliente.setEnd("Rua beija flor");
		cliente.setNumero(183);
		cliente.setCidade("Guarulhos");
		cliente.setEstado("São Paulo");
	}

	@Test
	public void pesquisarCliente() {
		
		Cliente clienteConsultado = clienteDao.bucarPorCPF(cliente.getCpf());
		
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() {
		// salvar cliente
		Boolean retorno = clienteDao.salvar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteDao.excluir(cliente.getCpf());
	}
}
