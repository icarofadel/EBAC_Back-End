package Factory;

public class CaminhaoFactory extends Factory{

	@Override
	Car retrieveCar(String requestedGrade) {
		// TODO Auto-generated method stub
		if ("Caminhão".equals(requestedGrade)) {
			return new CaminhaoVolvo(100, "Volvo", "diesel", "preto");
		}
		return null;
	}

}
