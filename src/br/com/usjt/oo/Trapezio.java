package br.com.usjt.oo;

public class Trapezio {
	private double baseMaior;
	private double baseMenor;
	private double altura;
	private double areaDoTrapezio;
	
	public Trapezio(double baseMaior, double baseMenor, double altura) {
		super();
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
		this.altura = altura;
	}

	public double getBaseMaior() {
		return baseMaior;
	}

	public double getBaseMenor() {
		return baseMenor;
	}

	public double getAltura() {
		return altura;
	}

	public double getAreaDoTrapezio() {
		return areaDoTrapezio;
	}

	
	public double area() {
		areaDoTrapezio = ((baseMaior * baseMenor) * altura)/2;
		return areaDoTrapezio;
	}


	
	
}
