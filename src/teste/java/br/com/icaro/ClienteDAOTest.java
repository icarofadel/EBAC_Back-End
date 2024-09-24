package br.com.icaro;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.icaro.dao.ClienteDaoMock;
import br.com.icaro.dao.IClienteDAO;
import br.com.icaro.domain.Cliente;
import br.com.icaro.exceptions.TipoChaveNaoEncontradaException;

public class ClienteDAOTest {
	
	private IClienteDAO clienteDao;
	
	private Cliente cliente;
	
	public ClienteDAOTest() {
		clienteDao = new ClienteDaoMock();
	}
	
	@Before
	public void init() throws TipoChaveNaoEncontradaException {
		//Criando cliente
		cliente = new Cliente();
		cliente.setCpf(49140092852L);
		cliente.setNome("Icaro");
		cliente.setTel(11949268848L);
		cliente.setEnd("Rua beija flor");
		cliente.setNumero(183);
		cliente.setCidade("Guarulhos");
		cliente.setEstado("São Paulo");
		clienteDao.cadastrar(cliente);
	}

	@Test
	public void pesquisarCliente() {
		
		Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
		
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		// salvar cliente
		Boolean retorno = clienteDao.cadastrar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteDao.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Icaro Natã");
		clienteDao.alterar(cliente);
		
		Assert.assertEquals("Icaro Natã", cliente.getNome());
		
	}
}
