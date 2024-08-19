package br.icaro.fadel;

public class Cliente {
	private int codigo;
	private String nome;
	private String endereco;
	
	/** Métodos gerados*/
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	/** Public porque todos podem ter acesso(Outras 
	 	* classes podem ter acesso , 
	 * void pq não tem retorno, se tivesse um 
		 * retorno em string você colocaria string e 
		 * assim vai*/
	
	public void cadastrarEndereco(String endereco) {
		setEndereco(endereco);
	}
	
	public void imprimirEndereco() {
		System.out.print(this.endereco);
	}
	
	public String retornarNomeCliente() {
		return "Endereço do Icaro";
	}
	
	public int getValorTotal() {
		return 20;
	}
}
