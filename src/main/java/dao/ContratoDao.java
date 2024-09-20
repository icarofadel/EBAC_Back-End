package dao;

public class ContratoDao implements IContratoDao {

	@Override
	public void salvar() {
		throw new UnsupportedOperationException("Não funciona sem o banco");
	}

	// Criar métodos de buscar, excluir e atualizar
	
	@Override
	public void buscar() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Não foi possivel buscar sem o banco de dados");
	}

	@Override
	public void excluir() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Não é possivel excluir sem o banco de dados");
	}

	@Override
	public void atualizar() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Não é possivel atualizar sem o banco de dados");
	}
	
}
