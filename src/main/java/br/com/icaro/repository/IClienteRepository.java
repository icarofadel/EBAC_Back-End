package br.com.icaro.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.icaro.domain.Cliente;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long>{

}