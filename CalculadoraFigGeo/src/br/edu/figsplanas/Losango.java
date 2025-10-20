package br.edu.figsplanas;

import java.util.Scanner;

public class Losango {
	public double diagonalMenor;
	public double diagonalMaior;
	public double area;
	
	public Losango() {
		
	}
	public void recebeDiagonalMaior() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da diagonal maior: ");
		diagonalMaior = sc.nextDouble();
	}
	public void recebeDiagonalMaior(double dmai) {
		diagonalMaior = dmai;
	}
	public void recebeDiagonalMenor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da diagonal menor: ");
		diagonalMenor = sc.nextDouble();
	}
	public void recebeDiagonalMenor(double dmen) {
		diagonalMenor = dmen;
	}
	public void calArea() {
		area = (diagonalMaior * diagonalMenor)/2;
	}
	public void retornaDiagonalMaior() {
		System.out.println("Diagonal maior = " + diagonalMaior);
	}
	public void retornaDiagonalMenor() {
		System.out.println("Diagonal menor = " + diagonalMenor);
	}
	public void retornaArea() {
		System.out.println("Área = " + area);
	}
	public void listaAtributos() {
		System.out.println("Diagonal maior = " + diagonalMaior);
		System.out.println("Diagonal menor = " + diagonalMenor);
		System.out.println("Área = " + area);
		System.out.println("---------------------------------------");
	}
}
