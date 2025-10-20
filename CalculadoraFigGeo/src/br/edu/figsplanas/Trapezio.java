package br.edu.figsplanas;

import java.util.Scanner;

public class Trapezio {
	public double baseMenor;
	public double baseMaior;
	public double altura;
	public double area;
	
	public Trapezio() {
		
	}
	public void recebeAltura() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da altura: ");
		altura = sc.nextDouble();
	}
	public void recebeAltura(double h) {
		altura = h;
	}
	public void recebeBaseMenor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da base menor: ");
		baseMenor = sc.nextDouble();
	}
	public void recebeBaseMenor(double bmen) {
		baseMenor = bmen;
	}
	public void recebeBaseMaior() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da base maior: ");
		baseMaior = sc.nextDouble();
	}
	public void recebeBaseMaior(double bmai) {
		baseMaior = bmai;
	}
	public void calArea() {
		area = ((baseMaior + baseMenor)*altura)/2;
	}
	public void retornaAltura() {
		System.out.println("Altura = " + altura);
	}
	public void retornaBaseMenor() {
		System.out.println("Base = " + baseMenor);
	}
	public void retornaBaseMaior() {
		System.out.println("Base = " + baseMaior);
	}
	public void retornaArea() {
		System.out.println("Área = " + area);
	}
	public void listaAtributos() {
		System.out.println("Altura = " + altura);
		System.out.println("Base menor = " + baseMenor);
		System.out.println("Base maior = " + baseMaior);
		System.out.println("Área = " + area);
		System.out.println("---------------------------------------");
	}
}
