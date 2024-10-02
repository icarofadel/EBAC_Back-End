package br.com.icaro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.icaro.dao.jdbc.ConnectionFactory;
import br.com.icaro.domain.Produto;

public class ProdutoDAO implements IProdutoDAO {

	@Override
	public Integer cadastrarProd(Produto produto) throws Exception {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement stm = null;
		
		try {
			connection = ConnectionFactory.getConnection();
			String sql = "INSERT INTO TB_PRODUTO (ID, NOME, VALOR) VALUES (nextval('SQ_PRODUTO'),?,?)";
			stm = connection.prepareStatement(sql);
			stm.setString(1, produto.getNome());
			stm.setDouble(2, produto.getValor());
			return stm.executeUpdate();
		} catch(Exception e) {
			throw e;
		} finally {
			if (stm != null && !stm.isClosed()) {
				stm.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
	}

	@Override
	public Produto consultarProd(Double preco) throws Exception {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		Produto produto = null;
		
		try {
			connection = ConnectionFactory.getConnection();
			String sql = "SELECT * FROM TB_PRODUTO WHERE VALOR = ?";
			stm = connection.prepareStatement(sql);
			stm.setDouble(1, preco);
			rs = stm.executeQuery();
			if (rs.next()) {
				produto = new Produto();
				produto.setId(rs.getLong("id"));
				produto.setValor(rs.getDouble("valor"));
				produto.setNome(rs.getString("nome"));
			}
			return produto;
		} catch(Exception e) {
			throw e;
		} finally {
			if (stm != null && !stm.isClosed()) {
				stm.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
	}

	@Override
	public Integer excluir(Produto produtoBD) throws Exception {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement stm = null;
		
		try {
			connection = ConnectionFactory.getConnection();
			String sql = "DELETE FROM TB_PRODUTO WHERE VALOR = ?";
			stm = connection.prepareStatement(sql);
			stm.setDouble(1, produtoBD.getValor());
			return stm.executeUpdate();
			
		} catch(Exception e) {
			throw e;
		} finally {
			if (stm != null && !stm.isClosed()) {
				stm.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
	}

	@Override
	public List<Produto> buscarTodosProdutosTest() throws Exception  {
		// TODO Auto-generated method stub
		Connection connection = null;
    	PreparedStatement stm = null;
    	ResultSet rs = null;
    	List<Produto> list = new ArrayList<>();
    	Produto produto = null;
		try {
			connection = ConnectionFactory.getConnection();
			String sql = getSqlSelectAll();
			stm = connection.prepareStatement(sql);
			rs = stm.executeQuery();
			
		    while (rs.next()) {
		    	produto = new Produto();
		    	Long id = rs.getLong("ID");
		    	String nome = rs.getString("NOME");
		    	Double cd = rs.getDouble("VALOR");
		    	produto.setId(id);
		    	produto.setNome(nome);
		    	produto.setValor(cd);
		    	list.add(produto);
		    }
		} catch(Exception e) {
			throw e;
		} finally {
			closeConnection(connection, stm, rs);
		}
		return list;
	}
	
	private String getSqlUpdate() {
		StringBuilder sb = new StringBuilder();
		sb.append("UPDATE TB_PRODUTO ");
		sb.append("SET NOME = ?, VALOR = ? ");
		sb.append("WHERE ID = ?");
		return sb.toString();
	}
	
	private void adicionarParametrosUpdate(PreparedStatement stm, Produto produto) throws SQLException {
		stm.setString(1, produto.getNome());
		stm.setDouble(2, produto.getValor());
		stm.setLong(3, produto.getId());
	}
	
	private String getSqlSelectAll() {
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT * FROM TB_PRODUTO");
		return sb.toString();
	}
	
	private void closeConnection(Connection connection, PreparedStatement stm, ResultSet rs) {
		try {
			if (rs != null && !rs.isClosed()) {
				rs.close();
			}
			if (stm != null && !stm.isClosed()) {
				stm.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public Integer atualizarProd(Produto produto) throws Exception {
		// TODO Auto-generated method stub
		Connection connection = null;
    	PreparedStatement stm = null;
		try {
			connection = ConnectionFactory.getConnection();
			String sql = getSqlUpdate();
			stm = connection.prepareStatement(sql);
			adicionarParametrosUpdate(stm, produto);
			return stm.executeUpdate();
		} catch(Exception e) {
			throw e;
		} finally {
			closeConnection(connection, stm, null);
		}
	}
}
