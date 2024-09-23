/**
 * 
 */
package br.com.icaro.dao;

import br.com.icaro.domain.Cliente;

/**
 * 
 */
public interface IClienteDAO {

	void salvar(Cliente cliente);
	
	Cliente bucarPorCPF(Long cpf);

}
