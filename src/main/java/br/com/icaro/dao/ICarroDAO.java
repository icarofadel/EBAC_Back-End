package br.com.icaro.dao;

import java.util.List;

import br.com.icaro.domain.Carro;

public interface ICarroDAO {

	Carro cadastrar(Carro carro);

	void excluir(Carro carro);

	List<Carro> buscarTodos();

}
