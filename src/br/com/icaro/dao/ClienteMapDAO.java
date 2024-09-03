package br.com.icaro.dao;

import br.com.icaro.domain.Cliente;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClienteMapDAO implements IClienteDAO {
	
	private Map<Long, Cliente> map;
	
	public ClienteMapDAO() {
		this.map = new HashMap<>();
	}
	
	@Override
	public boolean cadastrar(Cliente cliente) {
		// TODO Auto-generated method stub
		
		/* 
		 * aqui na hora que você estiver cadastrando ele irá verificar se o CPF já existe, 
		 * se já existir ele irá retornar false e não dara continuidade.
		 * */
		
		if (this.map.containsKey(cliente.getCpf())) {
			return false;
		}
		/*
		 * Se for ele não achar ele executa o comando abaixo e cadastra no banco com o "put"
		 * */
		this.map.put(cliente.getCpf(), cliente);
		return true;
	}

	@Override
	public void excluir(Long cpf) {
		// TODO Auto-generated method stub
		/* 
		 * Aqui você recupera o cpf guardado no map.
		 * */
		Cliente clienteCadastrado = this.map.get(cpf);
		
		/* 
		 * Se o cliente for diferente de null ele irá remover.
		 * */
		if (clienteCadastrado !=null) {
			this.map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
		}
	}

	@Override
	public void alterar(Cliente cliente) {
		// TODO Auto-generated method stub
		/*
		 * 1º Você está procurando o cliente pelo cpf.
		 * 2º Caso ele encontre o cliente você executa o if;
		 * 3º Ali você altera o setnome que está no banco para o novo valor get.
		 * */
		Cliente clienteCadastrado = this.map.get(cliente.getCpf());
		if (clienteCadastrado != null) {
			clienteCadastrado.setNome(cliente.getNome());
			clienteCadastrado.setTelefone(cliente.getTelefone());
			clienteCadastrado.setEndereco(cliente.getEndereco());
			clienteCadastrado.setEndereco(cliente.getEndereco());
			clienteCadastrado.setCidade(cliente.getCidade());
			clienteCadastrado.setEstado(cliente.getEstado());
		}
	}

	@Override
	public Cliente consultar(Long cpf) {
		// TODO Auto-generated method stub
		/*
		 * Aqui ele vai retornar o CPF, caso não encontre será nulo.
		 * */
		return this.map.get(cpf);
	}

	@Override
	public Collection<Cliente> buscarTodos() {
		// TODO Auto-generated method stub
		/*
		 * Aqui ele está retornando toda a coleção de coleção
		 * */
		return this.map.values();
	}
	
}
