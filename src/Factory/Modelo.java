package Factory;

public class Modelo {
    private String tipoVeiculo;
    private boolean carroPasseio;

    public Modelo(String tipoVeiculo, boolean carroPasseio) {
        this.tipoVeiculo = tipoVeiculo;
        this.carroPasseio = carroPasseio;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public boolean hasCarroPasseio() {
        return carroPasseio;
    }

    public boolean isCaminhao() {
        return "Caminhão".equalsIgnoreCase(tipoVeiculo);
    }
}
