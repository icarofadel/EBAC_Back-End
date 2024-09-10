package generic;

public class FabricanteToyota implements IFabricante<Toyota> {
    @Override
    public Toyota criarCarro(String modelo, int ano) {
        return new Toyota(modelo, ano);
    }
}
