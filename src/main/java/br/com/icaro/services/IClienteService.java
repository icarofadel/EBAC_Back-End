package br.com.icaro.services;

import br.com.icaro.domain.Cliente;

public interface IClienteService {

	Boolean salvar(Cliente cliente);

	Cliente bucarPorCPF(Long cpf);

	void excluir(Long cpf);
	
}
