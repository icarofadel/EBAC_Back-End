package testesStream;

import org.junit.Test;
import CadPessoa.criarPessoa;
import domain.Pessoa;
import org.junit.Assert;
import java.util.List;

public class testeFiltroF {
    
    @Test
    public void testeFiltro() {
        criarPessoa pessoaService = new criarPessoa();

        pessoaService.listarPessoas().add(new Pessoa("Ana", "F"));
        pessoaService.listarPessoas().add(new Pessoa("João", "M"));
        pessoaService.listarPessoas().add(new Pessoa("Maria", "F"));

        // Filtrando sexo feminino
        List<Pessoa> femininas = pessoaService.filtrarPorSexo("F");

        // Verificando se a lista contém exatamente 2 pessoas
        Assert.assertEquals(2, femininas.size());

        // Verificando se todos os itens da lista filtrada têm sexo "F"
        Assert.assertTrue(femininas.stream().allMatch(pessoa -> pessoa.getSexo().equalsIgnoreCase("F")));
    }
}
