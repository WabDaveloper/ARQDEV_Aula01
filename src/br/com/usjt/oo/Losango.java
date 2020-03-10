package br.com.usjt.oo;

public class Losango extends Poligono{
	private double areaDoLosango;
	private double perimetroLosango;
	

	public Losango(double base, double altura) {
		super();
		super.altura = altura;
		super.base = base;
	}

	public double getBase() {
		return super.base;
	}

	public double getAltura() {
		return super.altura;
	}

	@Override
	public double area() {
		areaDoLosango = base * altura;
		return areaDoLosango;
	}
	
	public double perimetro() {
		perimetroLosango = 4 * base; 
		return perimetroLosango;

	} 
	
	@Override
	public String toString() {
	return "\n----- LOSANGO -----"
			+ "\n Area do losango = " + area()  
			+ "\nPerimetro do losango vale: " + perimetro()
			+ "\n";
	}

}
