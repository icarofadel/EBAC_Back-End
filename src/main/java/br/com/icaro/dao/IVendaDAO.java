package br.com.icaro.dao;

import br.com.icaro.dao.generic.IGenericDAO;
import br.com.icaro.domain.Venda;
import br.com.icaro.exceptions.DAOException;
import br.com.icaro.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author icaro
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
