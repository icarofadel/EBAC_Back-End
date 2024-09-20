package service;

import dao.IContratoDao;

public class ContratoService implements IContratoService {
	
	private IContratoDao contratoDao;

	public ContratoService(IContratoDao dao) {
		// TODO Auto-generated constructor stub
		this.contratoDao = dao; 
	}

	public String salvar() {
		contratoDao.salvar();
		return "Sucesso";
	}
	
	// Criar métodos de buscar, excluir e atualizar

	@Override
	public String buscar() {
		// TODO Auto-generated method stub
		contratoDao.buscar();
		return "Buscou no banco de dados";
	}

	@Override
	public String excluir() {
		// TODO Auto-generated method stub
		contratoDao.excluir();
		return "Excluiu do banco de dados";
	}

	@Override
	public String atualizar() {
		// TODO Auto-generated method stub
		contratoDao.atualizar();
		return "Atualizou no banco de dados";
	}
}
