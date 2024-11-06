package br.com.icaro.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.icaro.domain.Produto;

@Repository
public interface IProdutoRepository extends CrudRepository<Produto, Long>{

}