package generic;

public class APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	IFabricante<Toyota> toyotaFabricante = new FabricanteToyota();
	        IFabricante<Honda> hondaFabricante = new FabricanteHonda();

	        GerenciarFabricantes<Toyota> gerenciadorToyota = new GerenciarFabricantes<>(toyotaFabricante);
	        gerenciadorToyota.adicionarCarro("Corolla", 2022);
	        gerenciadorToyota.adicionarCarro("Camry", 2023);

	        GerenciarFabricantes<Honda> gerenciadorHonda = new GerenciarFabricantes<>(hondaFabricante);
	        gerenciadorHonda.adicionarCarro("Civic", 2022);
	        gerenciadorHonda.adicionarCarro("Accord", 2023);

	        System.out.println("Carros da Toyota:");
	        gerenciadorToyota.listarCarros();

	        System.out.println("\nCarros da Honda:");
	        gerenciadorHonda.listarCarros();
	}

}
