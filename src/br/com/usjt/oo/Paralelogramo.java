package br.com.usjt.oo;

public class Paralelogramo extends Figura{
	private double base;
	private double altura;
	private double areaDoParalelogramo;
	private double perimetroParalelogramo;
	private double de;
	private double ef; 
	private double fg;
	private double gd;
	
	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	public Paralelogramo( double base, double altura, double lado1, double lado2,
						  double lado3, double lado4) {
		this.base = base;
		this.altura = altura;
		this.de = lado1;
		this.ef = lado2;
		this.fg = lado3;
		this.gd = lado4;
	}

	@Override
	public double area() {
		areaDoParalelogramo = getBase() * getAltura();
		return areaDoParalelogramo;
	}
	
	@Override
	public double perimetro (){
		perimetroParalelogramo = de + ef + fg + gd; 
		return perimetroParalelogramo;

	} 
	
	@Override
	public String toString() {
	return "\n----- PARALELOGRAMO -----"
			+ "\n Area do paralelogramo = " + area()  
			+ "\nPerimetro do paralelogramo vale: " + perimetro()
			+ "\n";
	}
	
	
}
