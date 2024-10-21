package br.com.icaro.dao.jpa;

import br.com.icaro.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.icaro.domain.jpa.ClienteJpa;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}