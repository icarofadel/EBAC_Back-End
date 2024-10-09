package br.com.icaro.dao;

import java.util.List;

import br.com.icaro.domain.Produto;

public interface IProdutoDao {

	Produto cadastrar(Produto produto);

	void excluir(Produto produto);

	List<Produto> buscarTodos();

}
