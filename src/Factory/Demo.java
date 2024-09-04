package Factory;

import java.util.Scanner;

public class Demo {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de veículo (Caminhão ou Passeio): ");
        String tipoVeiculo = scanner.nextLine();

        Modelo model = new Modelo(tipoVeiculo, "Passeio".equalsIgnoreCase(tipoVeiculo));
        Factory factory = getFactory(model);
        Car car = factory.create(model.getTipoVeiculo());
        car.startEngine();

        scanner.close();
    }

    public static Factory getFactory(Modelo model) {
        if (model.hasCarroPasseio()) {
            return new CarroPasseioFactory();
        } else {
            return new CaminhaoFactory();
        }
    }
}
