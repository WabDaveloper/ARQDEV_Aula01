package br.com.usjt.oo;

public class Triangulo extends Poligono {

	private double areaDoTriangulo;
	private double perimetroTriangulo;
	private double mn;
	private double np;
	private double pm;
	
	
	
	public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
		super();
		super.base = base;
		super.altura = altura;
		this.mn = lado1;
		this.np = lado2;
		this.pm = lado3;
	}
	public Triangulo(double base, double altura ) {
		super.base = base;
		super.altura = altura;
	}

	public double getBase() {
		return super.base;
	}
	
	public double getAreaDoTriangulo() {
		return areaDoTriangulo;
	}

	public double getPerimetroTriangulo() {
		return perimetroTriangulo;
	}

	public double getMn() {
		return mn;
	}

	public double getNp() {
		return np;
	}

	public double getPm() {
		return pm;
	}

	public double getAltura() {
		return super.altura;
	}

	@Override
	public double area() {
		areaDoTriangulo = (base * altura)/2;
	return areaDoTriangulo;
	}
	
	@Override
	public double perimetro() {
		perimetroTriangulo = mn + np + pm;
		return perimetroTriangulo;
	}
	
	@Override
	public String toString() {
	return "\n----- TRIANGULO -----"
			+ "\n Area do triangulo = " + area()  
			+ "\nPerimetro do triangulo vale: " + perimetro()
			+ "\n";
	}


	


}
