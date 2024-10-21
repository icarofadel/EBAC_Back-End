/**
 * 
 */
package br.com.icaro.dao.jpa;

import br.com.icaro.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.icaro.domain.jpa.ClienteJpa;

/**
 * @author rodrigo.pires
 *
 */
public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}