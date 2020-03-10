package br.com.usjt.testes;

import br.com.usjt.oo.Triangulo;
import br.com.usjt.oo.Volume;

public class Piramide  extends Triangulo implements Volume{

	private final double constante = 0.33;

	public Piramide(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double calculaVolume() {
		return constante * Math.pow(base, 2) * altura;
	}

	@Override
	public String toString() {
	return "\n----- PIRÂMIDE -----"
			+ "\nVolume da pirâmide = " + calculaVolume() + "m³" 
			+ "\n";
	}
}
