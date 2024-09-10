package generic;

public interface IFabricante<T extends ICarros> {
    T criarCarro(String modelo, int ano);
}
