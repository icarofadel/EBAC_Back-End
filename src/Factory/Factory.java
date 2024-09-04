package Factory;

public abstract class Factory {
	
	public Car create(String requestedGrade) {
		Car car = retrieveCar(requestedGrade);
		car = preparacar(car);
		return car;
	}
	private Car preparacar (Car car ) {
		car.clean();
		return car;
	}
	abstract Car retrieveCar(String requestedGrade);
}
