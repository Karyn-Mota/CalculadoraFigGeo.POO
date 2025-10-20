package br.edu.figsplanas;

import java.util.Scanner;

public class Circulo {
	public double raio;
	public double area;
	
	public Circulo() {
		
	}
	public void recebeRaio() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do lado: ");
		raio = sc.nextDouble();
	}
	public void recebeRaio(double r) {
		raio = r;
	}
	public void calArea() {
		double quadRaio = Math.pow(raio, 2);
		area = Math.PI * quadRaio;
	}
	public void retornaRaio() {
		System.out.println("Raio = " + raio);
	}
	public void retornaArea() {
		System.out.println("Área = " + area);
	}
	public void listaAtributos() {
		System.out.println("Raio = " + raio);
		System.out.println("Área = " + area);
		System.out.println("---------------------------------------");
	}
}