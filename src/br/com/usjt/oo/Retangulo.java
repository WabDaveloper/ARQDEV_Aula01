package br.com.usjt.oo;

public class Retangulo extends Poligono implements Diagonal{
		private double areaDoRetangulo;
		private double diagonalRetangulo;
		private double perimetroRetangulo;
	
	public Retangulo(double lado1, double lado2) {
		super();
		super.base = lado1;
		super.altura = lado2;
	}

	public double getLado1() {
		return base;
	}

	public double getLado2() {
		return altura;
	}

	@Override
	public double area() {
		areaDoRetangulo = base * altura; 
		return areaDoRetangulo;
	}

	@Override
	public double calculaDiagonal() {
		diagonalRetangulo = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));	
		return diagonalRetangulo;
	}
	
	@Override
	public double perimetro() {
		perimetroRetangulo = (2 * getLado2()) + (2* getLado1()); 
		return perimetroRetangulo;

	} 
	
	@Override
	public String toString() {
	return "\n----- RETANGULO -----"
			+ "\n Area do retangulo = " + area()  
			+ "\nDiagonal do retangulo vale: " +calculaDiagonal()
			+ "\nPerimetro do retangulo vale: " + perimetro()
			+ "\n";
	}
	
	
}
