package generic;

	public class FabricanteHonda implements IFabricante<Honda> {
	    @Override
	    public Honda criarCarro(String modelo, int ano) {
	        return new Honda(modelo, ano);
	    }
	}

