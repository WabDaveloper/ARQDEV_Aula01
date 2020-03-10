package br.com.usjt.testes;

import br.com.usjt.oo.Circulo;
import br.com.usjt.oo.Volume;

public class Esfera extends Circulo implements Volume {
	
	private final double constante = 4/3;
	
	
	public Esfera(double raio) {
		super(raio);
	}

	@Override
	public double calculaVolume() {
		return constante * super.pi * Math.pow(raio, 3);
	}
	
	@Override
	public String toString() {
	return "\n---- ESFERA -----"
			+ "\nVolume da esfera = " + calculaVolume() + "m³"
			+ "\n";
	}
	
}
