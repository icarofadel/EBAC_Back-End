/**
 * 
 */
package br.com.icaro.services;

import br.com.icaro.dao.IProdutoDAO;
import br.com.icaro.domain.Produto;
import br.com.icaro.services.generic.GenericService;

/**
 * @author icaro
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
