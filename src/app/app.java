package app;

import domain.Pessoa;
import CadPessoa.criarPessoa;
import java.util.List;

public class app {
    public static void main(String[] args) {
    	criarPessoa pessoaService = new criarPessoa();

        pessoaService.criarPessoa();  // Cria as pessoas

        // Lista todas as pessoas
        List<Pessoa> todasPessoas = pessoaService.listarPessoas();
        System.out.println("*** Todas as Pessoas ***");
        todasPessoas.forEach(pessoa -> System.out.println(pessoa.getNome()));

        // Filtra pessoas do sexo feminino
        List<Pessoa> femininas = pessoaService.filtrarPorSexo("F");
        System.out.println("*** Pessoas do sexo Feminino ***");
        femininas.forEach(pessoa -> System.out.println(pessoa.getNome()));
    }
}
