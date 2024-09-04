package Factory;

public abstract class Car {
	
	private int cavalos;
	private String modelo;
	private String combustivel;
	private String color;
	
	public Car(int cavalos, String modelo, String combustivel, String color) {
		this.cavalos = cavalos;
		this.modelo = modelo;
		this.combustivel = combustivel;
		this.color = color;
	}
	
	public void startEngine() {
		System.out.println("O veículo " + modelo + " com " + cavalos + "cv" + " e com a cor: " + color + " movido a " + combustivel + " está pronto");
	}
    public void clean(){
        System.out.println("O veículo do modelo: " + modelo + " " + color.toLowerCase() + " Foi limpo.");
    }
}
