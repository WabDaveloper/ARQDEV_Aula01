package br.com.usjt.oo;

public class Cubo extends Quadrado implements Volume {

	public Cubo(double base) {
		super(base);
	}

	@Override
	public double calculaVolume() {
		return Math.pow(base, 3);
	}
	
	@Override
	public String toString() {
	return "\n----- CUBO -----"
			+ "\n Volume do cubo = " + calculaVolume() + "m³"
			+ "\n"; 
	}

}
