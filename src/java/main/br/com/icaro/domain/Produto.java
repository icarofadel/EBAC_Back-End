package br.com.icaro.domain;

public class Produto {
	
	private Long id;
	private String nome;
	private Double valor;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double preco) {
		this.valor = preco;
	}
	
}
