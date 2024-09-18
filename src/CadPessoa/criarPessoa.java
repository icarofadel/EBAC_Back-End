package CadPessoa;

import domain.Pessoa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class criarPessoa {
    private List<Pessoa> pessoas = new ArrayList<>();

    // Criar novas pessoas
    public void criarPessoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome e o sexo da pessoa (M/F) separados por espaço (ou digite 'sair' para terminar):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("sair")) {
                break;
            }

            String[] dados = input.split(" ");
            if (dados.length == 2) {
                String nome = dados[0];
                String sexo = dados[1].toUpperCase();

                if (sexo.equals("M") || sexo.equals("F")) {
                    pessoas.add(new Pessoa(nome, sexo));
                } else {
                    System.out.println("Sexo inválido! Use 'M' para masculino ou 'F' para feminino.");
                }
            } else {
                System.out.println("Entrada inválida! Digite o nome e o sexo separados por espaço.");
            }
        }
    }

    //listar todas as pessoas
    public List<Pessoa> listarPessoas() {
        return pessoas;
    }

    //filtrar pessoas por sexo
    public List<Pessoa> filtrarPorSexo(String sexo) {
        return pessoas.stream()
                .filter(pessoa -> pessoa.getSexo().equalsIgnoreCase(sexo))
                .collect(Collectors.toList());

    }
}

