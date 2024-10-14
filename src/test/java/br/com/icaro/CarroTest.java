package br.com.icaro;

import static org.junit.Assert.assertNotNull;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.icaro.dao.AcessorioDAO;
import br.com.icaro.dao.CarroDAO;
import br.com.icaro.dao.IAcessorioDAO;
import br.com.icaro.dao.ICarroDAO;
import br.com.icaro.dao.IMarcaDAO;
import br.com.icaro.dao.MarcaDAO;
import br.com.icaro.domain.Carro;
import br.com.icaro.domain.Marca;
import br.com.icaro.domain.Acessorio;

import java.util.ArrayList;

public class CarroTest {

    private ICarroDAO carroDao;
    private IMarcaDAO marcaDao;
    private IAcessorioDAO acessorioDao;

    public CarroTest() {
        carroDao = new CarroDAO();
        marcaDao = new MarcaDAO();
        acessorioDao = new AcessorioDAO();
    }

    @Before
    public void setUp() {
        List<Carro> list = carroDao.buscarTodos();
        list.forEach(carro -> carroDao.excluir(carro));
    }

    @After
    public void end() {
        List<Carro> list = carroDao.buscarTodos();
        list.forEach(carro -> carroDao.excluir(carro));
    }

    @Test
    public void cadastrar() {

        Marca marca = new Marca();
        marca.setNome("Toyota");
        marca = marcaDao.cadastrar(marca);  
        

        Acessorio acessorio1 = new Acessorio();
        acessorio1.setNome("GPS");
        acessorio1 = acessorioDao.cadastrar(acessorio1); 
        
        Acessorio acessorio2 = new Acessorio();
        acessorio2.setNome("Airbag");
        acessorio2 = acessorioDao.cadastrar(acessorio2);  
        
        
        Carro carro = new Carro();
        carro.setModelo("Corolla");
        carro.setMarca(marca);
        
        List<Acessorio> acessorios = new ArrayList<>();
        acessorios.add(acessorio1);
        acessorios.add(acessorio2);
        carro.setAcessorios(acessorios); 
        

        carro = carroDao.cadastrar(carro);


        assertNotNull(carro);
        assertNotNull(carro.getId());
    }
}
