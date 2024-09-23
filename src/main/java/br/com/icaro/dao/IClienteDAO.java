/**
 * 
 */
package br.com.icaro.dao;

import br.com.icaro.domain.Cliente;

/**
 * 
 */
public interface IClienteDAO {

	Boolean salvar(Cliente cliente);
	
	Cliente bucarPorCPF(Long cpf);

	void excluir(Long cpf);

}
