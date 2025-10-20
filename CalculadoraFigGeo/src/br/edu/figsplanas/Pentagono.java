package br.edu.figsplanas;

import java.util.Scanner;

public class Pentagono {
	public double lado;
	public double apotema;
	public double area;
	
	public Pentagono() {
		
	}
	public void recebeApotema() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da apotema: ");
		apotema = sc.nextDouble();
	}
	public void recebeApotema(double a) {
		apotema = a;
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
		area = 5 * lado * apotema;
	}
	public void retornaApotema() {
		System.out.println("Apotema = " + apotema);
	}
	public void retornaLado() {
		System.out.println("Lado = " + lado);
	}
	public void retornaArea() {
		System.out.println("Área = " + area);
	}
	public void listaAtributos() {
		System.out.println("Apotema = " + apotema);
		System.out.println("Lado = " + lado);
		System.out.println("Área = " + area);
		System.out.println("---------------------------------------");
	}
}
