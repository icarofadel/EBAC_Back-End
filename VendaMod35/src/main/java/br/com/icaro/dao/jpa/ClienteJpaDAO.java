/**
 * 
 */
package br.com.icaro.dao.jpa;

import br.com.icaro.dao.generic.jpa.GenericJpaDAO;
import br.com.icaro.domain.jpa.ClienteJpa;


public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}