package br.com.icaro;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.icaro.dao.IAcessorioDAO;
import br.com.icaro.dao.AcessorioDAO;
import br.com.icaro.domain.Acessorio;

public class AcessorioTest {

    private IAcessorioDAO acessorioDao;

    public AcessorioTest() {
        acessorioDao = new AcessorioDAO();
    }

    @Before
    public void setUp() {

        List<Acessorio> list = acessorioDao.buscarTodos();
        list.forEach(acessorio -> acessorioDao.excluir(acessorio));
    }

    @After
    public void end() {

        List<Acessorio> list = acessorioDao.buscarTodos();
        list.forEach(acessorio -> acessorioDao.excluir(acessorio));
    }

    @Test
    public void cadastrar() {

        Acessorio acessorio = new Acessorio();
        acessorio.setNome("GPS");


        acessorio = acessorioDao.cadastrar(acessorio);


        assertNotNull(acessorio);
        assertNotNull(acessorio.getId());
    }
}
