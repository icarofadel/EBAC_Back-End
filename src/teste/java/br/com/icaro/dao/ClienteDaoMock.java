package br.com.icaro.dao;

import br.com.icaro.domain.Cliente;

public class ClienteDaoMock implements IClienteDAO {

	@Override
	public Boolean salvar(Cliente cliente) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Cliente bucarPorCPF(Long cpf) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
		cliente.setCpf(cpf);
		return cliente;
	}

	@Override
	public void excluir(Long cpf) {
		// TODO Auto-generated method stub
		
	}

}