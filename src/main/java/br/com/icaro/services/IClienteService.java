package br.com.icaro.services;

import br.com.icaro.domain.Cliente;

public interface IClienteService {

	void salvar(Cliente cliente);

	Cliente bucarPorCPF(Long cpf);
	
}
