package br.com.icaro.services;

import br.com.icaro.dao.IClienteDAO;
import br.com.icaro.domain.Cliente;

public class ClienteService implements IClienteService {
	
	private IClienteDAO clienteDAO;
	
	public ClienteService(IClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}

	@Override
	public void salvar(Cliente cliente) {
		// TODO Auto-generated method stub
		clienteDAO.salvar(cliente);
	}

	@Override
	public Cliente bucarPorCPF(Long cpf) {
		// TODO Auto-generated method stub
		return clienteDAO.bucarPorCPF(cpf);
	}

}
