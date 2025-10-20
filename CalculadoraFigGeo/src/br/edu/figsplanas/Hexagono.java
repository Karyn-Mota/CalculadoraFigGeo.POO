package br.edu.figsplanas;

import java.util.Scanner;

public class Hexagono {
	public double lado;
	public double area;
	
	public Hexagono() {
		
	}
	public void recebeLado() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do lado: ");
		lado = sc.nextDouble();
	}
	public void recebeLado(double l) {
		lado = l;
	}
	public void calArea() {
		double quadLado = Math.pow(lado, 2);
		area = (3 * quadLado * Math.sqrt(3))/2;
	}
	public void retornaLado() {
		System.out.println("Lado = " + lado);
	}
	public void retornaArea() {
		System.out.println("Área = " + area);
	}
	public void listaAtributos() {
		System.out.println("Lado = " + lado);
		System.out.println("Área = " + area);
		System.out.println("---------------------------------------");
	}
}

