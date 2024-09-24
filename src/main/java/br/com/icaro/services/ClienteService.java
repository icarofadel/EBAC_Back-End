package br.com.icaro.services;

import br.com.icaro.dao.IClienteDAO;
import br.com.icaro.domain.Cliente;
import br.com.icaro.exceptions.TipoChaveNaoEncontradaException;

public class ClienteService implements IClienteService {
	
	private IClienteDAO clienteDAO;
	
	public ClienteService(IClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}

	@Override
	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		return clienteDAO.cadastrar(cliente);
	}

	@Override
	public Cliente bucarPorCPF(Long cpf) {
		// TODO Auto-generated method stub
		return clienteDAO.consultar(cpf);
	}

	@Override
	public void excluir(Long cpf) {
		// TODO Auto-generated method stub
		clienteDAO.excluir(cpf);
	}

	@Override
	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		clienteDAO.alterar(cliente);
	}

}
