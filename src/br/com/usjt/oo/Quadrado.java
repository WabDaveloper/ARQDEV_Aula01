package br.com.usjt.oo;

public class Quadrado extends Poligono implements Diagonal {
	private double areaQuadrado;
	private double diagonalQuadrado;
	private double perimetroQuadrado;
	
	public Quadrado(double base) {
		super();
		super.base = base;
	}

	public double getLado() {
		return super.base;
	}

	
	public double area() {
		areaQuadrado = Math.pow(base, 2);
		return areaQuadrado;
	}
	
	@Override
	public double perimetro() {
		perimetroQuadrado = 4 * base; 
		return perimetroQuadrado;

	} 

	@Override
	public double calculaDiagonal() {
		diagonalQuadrado = base * (Math.sqrt(2));
		return diagonalQuadrado;
	}
	
	@Override
	public String toString() {
	return "\n----- QUADRADO -----"
			+ "\n Area do quadrado = " + area()  
			+ "\nDiagonal do quadrado vale: " +calculaDiagonal()
			+ "\nPerimetro do quadrado vale: " +perimetro()
			+ "\n";
	}
	
}
