package br.edu.figsespaciais;
import java.util.Scanner;

public class Cubo {
	public double aresta;
	public double areaSuperficie;
	public double volume;
		
	public Cubo() {
			
	}
	public void recebeAresta() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da aresta: ");
		aresta = sc.nextDouble();
	}
	public void recebeAresta(double a) {
		aresta = a;
	}
	public void calcAreaSuperficie() {
		double quadAresta = Math.pow(aresta, 2);
		areaSuperficie = 6 * quadAresta;
	}
	public void calcVolume() {
		volume = Math.pow(aresta, 3);
	}
	public void retornaAresta() {
		System.out.println("Aresta = " + aresta);
	}
	public void retornaAreaSuperficie() {
		System.out.println("Área da superfície = " + areaSuperficie);
	}
	public void retornaVolume() {
		System.out.println("Volume = " + volume);
	}
	public void listaAtributos() {
		System.out.println("Aresta = " + aresta);
		System.out.println("Área da superfície = " + areaSuperficie);
		System.out.println("Volume = " + volume);
		System.out.println("---------------------------------------");
		}
}