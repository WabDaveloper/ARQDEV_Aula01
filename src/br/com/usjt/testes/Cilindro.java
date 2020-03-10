package br.com.usjt.testes;

import br.com.usjt.oo.Circulo;
import br.com.usjt.oo.Volume;

public class Cilindro extends Circulo implements Volume {
	private double altura;
	
	public Cilindro(double raio, double altura) {
		super(raio);
		this.altura = altura;
	}

	@Override
	public double calculaVolume() {
		return super.area() * altura;
	}
	
	@Override
	public String toString() {
	return "\n---- CILINDRO -----"
			+ "\nVolume do cilindro = " + calculaVolume() + "m³"
			+"\n";
	}
	
}
