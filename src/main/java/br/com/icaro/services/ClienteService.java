package br.com.icaro.services;

import br.com.icaro.dao.IClienteDAO;
import br.com.icaro.domain.Cliente;

public class ClienteService implements IClienteService {
	
	private IClienteDAO clienteDAO;
	
	public ClienteService(IClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}

	@Override
	public Boolean salvar(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteDAO.salvar(cliente);
	}

	@Override
	public Cliente bucarPorCPF(Long cpf) {
		// TODO Auto-generated method stub
		return clienteDAO.bucarPorCPF(cpf);
	}

	@Override
	public void excluir(Long cpf) {
		// TODO Auto-generated method stub
		//clienteDAO.excluir();
	}

}
