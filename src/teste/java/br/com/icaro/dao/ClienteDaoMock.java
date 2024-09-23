package br.com.icaro.dao;

import br.com.icaro.domain.Cliente;

public class ClienteDaoMock implements IClienteDAO {

	@Override
	public void salvar(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente bucarPorCPF(Long cpf) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
		cliente.setCpf(cpf);
		return cliente;
	}

}
