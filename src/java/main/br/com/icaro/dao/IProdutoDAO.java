package br.com.icaro.dao;

import java.util.List;

import br.com.icaro.domain.Produto;

public interface IProdutoDAO {

	Integer cadastrarProd(Produto produto) throws Exception;

	Produto consultarProd(Double preco) throws Exception;

	Integer excluir(Produto produtoBD) throws Exception;

	List<Produto> buscarTodosProdutosTest() throws Exception;

	Integer atualizarProd(Produto produtoBD) throws Exception;

}
