package br.com.icaro;

import org.junit.Assert;
import org.junit.Test;

import br.com.icaro.dao.ClienteDaoMock;
import br.com.icaro.dao.IClienteDAO;
import br.com.icaro.domain.Cliente;
import br.com.icaro.services.ClienteService;
import br.com.icaro.services.IClienteService;

public class ClienteTest {
	
	private IClienteService clienteService;
	
	public ClienteTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}
	
	//Criando cliente
	@Test
	public void pesquisarCliente() {
		Cliente cliente = new Cliente();
		cliente.setCpf(49140092852L);
		cliente.setNome("Icaro");
		cliente.setTel(11949268848L);
		cliente.setEnd("Rua beija flor");
		cliente.setNumero(183);
		cliente.setCidade("Guarulhos");
		cliente.setEstado("São Paulo");
		
		// salvar cliente
		clienteService.salvar(cliente);
		
		//buscar cliente
		
		Cliente clienteConsultado = clienteService.bucarPorCPF(cliente.getCpf());
		
		Assert.assertNotNull(clienteConsultado);
	}
}
