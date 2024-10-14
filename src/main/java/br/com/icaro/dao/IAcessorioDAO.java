package br.com.icaro.dao;

import java.util.List;

import br.com.icaro.domain.Acessorio;

public interface IAcessorioDAO {
	
	Acessorio cadastrar(Acessorio acessorio);

	void excluir(Acessorio acessorio);

	List<Acessorio> buscarTodos();

}
