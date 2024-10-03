/**
 * 
 */
package br.com.icaro.services;

import br.com.icaro.domain.Cliente;
import br.com.icaro.exceptions.DAOException;
import br.com.icaro.exceptions.TipoChaveNaoEncontradaException;
import br.com.icaro.services.generic.IGenericService;

/**
 * @author icaro
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
