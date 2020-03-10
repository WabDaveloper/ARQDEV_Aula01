package br.com.usjt.oo;

public class Circulo extends Figura{
	protected double raio;
	protected final double pi = 3.14;
	protected double areaDoCirculo;
	private double perimetroCirculo;
	
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public double getPi() {
		return pi;
	}


	@Override
	public double area() {
		areaDoCirculo = pi * Math.pow(raio, 2);
		return areaDoCirculo;
	}
	
	public double perimetro() {
		perimetroCirculo = 2 * pi * getRaio();
		return perimetroCirculo;
	}
	
	@Override
	public String toString() {
	return "\n---- CIRCULO -----"
			+ "\nArea do circulo = " + area() + 
			"\nPerimetro do circulo vale: " + perimetro()
			+ "\n";
	}

}
