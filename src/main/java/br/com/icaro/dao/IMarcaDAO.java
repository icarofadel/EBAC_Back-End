package br.com.icaro.dao;

import java.util.List;

import br.com.icaro.domain.Marca;

public interface IMarcaDAO {

	Marca cadastrar(Marca marca);

	void excluir(Marca marca);

	List<Marca> buscarTodos();

}
