package br.icaro.fadel;

public class PrimeiraClasse {

	public static void main(String[] args) {
		System.out.print("Olá Icaro");
		
		Cliente cliente = new Cliente();
		cliente.cadastrarEndereco("Rua 1");
		cliente.setCodigo(1);
		System.out.print(cliente.getCodigo());
		
		// cliente.imprimirEndereco();
		System.out.print(cliente.retornarNomeCliente());
		System.out.print(cliente.getValorTotal());

	}

}
