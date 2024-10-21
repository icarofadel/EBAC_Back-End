package br.com.icaro.dao.jpa;

import br.com.icaro.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.icaro.domain.jpa.ProdutoJpa;


public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}