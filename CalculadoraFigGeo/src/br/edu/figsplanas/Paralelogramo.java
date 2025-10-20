package br.edu.figsplanas;

import java.util.Scanner;

public class Paralelogramo {
	public double base;
	public double altura;
	public double area;
	
	public Paralelogramo() {
		
	}
	public void recebeAltura() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da altura: ");
		altura = sc.nextDouble();
	}
	public void recebeAltura(double h) {
		altura = h;
	}
	public void recebeBase() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da base: ");
		base = sc.nextDouble();
	}
	public void recebeBase(double b) {
		base = b;
	}
	public void calArea() {
		area = base * altura;
	}
	public void retornaAltura() {
		System.out.println("Altura = " + altura);
	}
	public void retornaBase() {
		System.out.println("Base = " + base);
	}
	public void retornaArea() {
		System.out.println("Área = " + area);
	}
	public void listaAtributos() {
		System.out.println("Altura = " + altura);
		System.out.println("Base = " + base);
		System.out.println("Área = " + area);
		System.out.println("---------------------------------------");
	}
}