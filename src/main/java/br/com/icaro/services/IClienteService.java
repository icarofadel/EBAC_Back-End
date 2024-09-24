package br.com.icaro.services;

import br.com.icaro.domain.Cliente;
import br.com.icaro.exceptions.TipoChaveNaoEncontradaException;

public interface IClienteService {

	Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente bucarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;
	
}
