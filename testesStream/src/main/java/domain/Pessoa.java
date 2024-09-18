package domain;

import java.util.Objects;

public class Pessoa {
    private String nome;
    private String sexo;

    public Pessoa() {}

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sexo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pessoa other = (Pessoa) obj;
        return Objects.equals(nome, other.nome) && Objects.equals(sexo, other.sexo);
    }
}