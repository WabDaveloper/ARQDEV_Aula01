package br.com.usjt.testes;

import java.util.ArrayList;
import java.util.List;

import br.com.usjt.oo.Circulo;
import br.com.usjt.oo.Cubo;
import br.com.usjt.oo.Figura;
import br.com.usjt.oo.Losango;
import br.com.usjt.oo.Paralelogramo;
import br.com.usjt.oo.Quadrado;
import br.com.usjt.oo.Retangulo;
import br.com.usjt.oo.Trapezio;
import br.com.usjt.oo.Triangulo;

public class Geometria {

	public static void main(String[] args) {

		List<Figura> figuras = new ArrayList<Figura>(); 
		
		Retangulo retangulo = new Retangulo(10, 10);
		figuras.add(retangulo);
		
		Triangulo triangulo = new Triangulo(10, 5, 2, 2, 2);
		figuras.add(triangulo);
		
		Losango losango = new Losango(10, 5);
		figuras.add(losango);
		
		Quadrado quadrado = new Quadrado(10);
		figuras.add(quadrado);
		
		Circulo circulo = new Circulo(5);
		figuras.add(circulo);
		
		Paralelogramo paralelogramo = new Paralelogramo(5, 10, 2, 2, 2, 2);
		figuras.add(paralelogramo);
		
		Trapezio trapezio = new Trapezio(10, 5, 2);
		//figuras.add(trapezio);
		
		Cubo cubo = new Cubo(2);
		figuras.add(cubo);
		
		Cilindro cilindro = new Cilindro(2, 4);
		figuras.add(cilindro);
		
		Esfera esfera = new Esfera(2);
		figuras.add(esfera);
		
		Piramide piramide = new Piramide(2,4);
		figuras.add(piramide);
		
		System.out.println(figuras);
	
	}

}
