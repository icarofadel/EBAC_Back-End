package generic;

import java.util.ArrayList;
import java.util.List;

public class GerenciarFabricantes<T extends ICarros> {
    private List<T> carros = new ArrayList<>();
    private IFabricante<T> fabricante;

    public GerenciarFabricantes(IFabricante<T> fabricante) {
        this.fabricante = fabricante;
    }

    public void adicionarCarro(String modelo, int ano) {
        T carro = fabricante.criarCarro(modelo, ano);
        carros.add(carro);
    }

    public void listarCarros() {
        for (T carro : carros) {
            carro.detalhes();
        }
    }
}
