package br.com.icaro.PrimeiroExemploSpringBoot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.icaro.domain.Cliente;
import br.com.icaro.domain.Produto;
import br.com.icaro.repository.IClienteRepository;
import br.com.icaro.repository.IProdutoRepository;

@SpringBootApplication
@Configuration
@EnableJpaRepositories(basePackages = "br.com.icaro.repository")
@EntityScan("br.com.icaro.*")  
@ComponentScan(basePackages = "br.com.icaro")
public class PrimeiroExemploSpringBootApplication implements CommandLineRunner {
	
	private static final Logger log = LoggerFactory.getLogger(PrimeiroExemploSpringBootApplication.class);
	
	@Autowired
	private IClienteRepository repositoryCliente;
	
	@Autowired
	private IProdutoRepository repositoryProduto;

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroExemploSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Iniciando aplicação...");
		Cliente cliente = createCliente();
		Produto produto = createProduto();
		repositoryCliente.save(cliente);
		repositoryProduto.save(produto);
	}

	private Cliente createCliente() {
		return Cliente.builder()
				.nome("Teste Spring Boot")
				.cpf(12312312310L)
				.email("Teste@teste.com")
				.tel(10203040L)
				.end("End")
				.numero(102030)
				.cidade("SP")
				.estado("SP")
				.build();
	}
	
	private Produto createProduto() {
		return Produto.builder()
				.nome("Controle PS5")
				.descricao("Controle sem fio PS5")
				.valor(500d)
				.build();
	}

}