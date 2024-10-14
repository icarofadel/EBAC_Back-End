package br.com.icaro;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.icaro.dao.IMarcaDAO;
import br.com.icaro.dao.MarcaDAO;
import br.com.icaro.domain.Marca;

public class MarcaTest {

    private IMarcaDAO marcaDao;

    public MarcaTest() {
        marcaDao = new MarcaDAO();
    }

    @Before
    public void setUp() {

        List<Marca> list = marcaDao.buscarTodos();
        list.forEach(marca -> marcaDao.excluir(marca));
    }

    @After
    public void end() {

        List<Marca> list = marcaDao.buscarTodos();
        list.forEach(marca -> marcaDao.excluir(marca));
    }

    @Test
    public void cadastrar() {

        Marca marca = new Marca();
        marca.setNome("Toyota");

        marca = marcaDao.cadastrar(marca);

        assertNotNull(marca);
        assertNotNull(marca.getId());
    }
}
