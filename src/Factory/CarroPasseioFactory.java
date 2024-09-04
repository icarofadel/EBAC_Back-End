package Factory;

public class CarroPasseioFactory extends Factory {

	@Override
	Car retrieveCar(String requestedGrade) {
		// TODO Auto-generated method stub
		if("Passeio".equals(requestedGrade)) {
			return new GolCar(89, "Gol", "gasolina", "preto");
		} else{
			return null;
		}
	}

}
