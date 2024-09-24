package br.com.icaro;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.icaro.dao.ClienteDaoMock;
import br.com.icaro.dao.IClienteDAO;
import br.com.icaro.domain.Cliente;
import br.com.icaro.exceptions.TipoChaveNaoEncontradaException;
import br.com.icaro.services.ClienteService;
import br.com.icaro.services.IClienteService;

public class ClienteServiceTest {
	
	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
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
		//buscar cliente
		
		Cliente clienteConsultado = clienteService.bucarPorCPF(cliente.getCpf());
		
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		// salvar cliente
		Boolean retorno = clienteService.salvar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Icaro Natã");
		clienteService.alterar(cliente);
		Assert.assertEquals("Icaro Natã", cliente.getNome());
	}
}
