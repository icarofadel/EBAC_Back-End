package generic;

public class Honda implements ICarros {
    private String modelo;
    private int ano;

    public Honda(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public int getAno() {
        return ano;
    }

    @Override
    public void detalhes() {
        System.out.println("Toyota " + modelo + " - Ano: " + ano);
    }
}
