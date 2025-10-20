package br.edu.principal;

import br.edu.figsplanas.*;
import br.edu.figsespaciais.*;

public class Principal {
	
	public static void main(String[] args) {
		Triangulo obj1 = new Triangulo();
		obj1.recebeAltura();
		obj1.recebeBase();
		obj1.calArea();
		obj1.retornaAltura();
		obj1.retornaBase();
		obj1.retornaArea();
		obj1.listaAtributos();
		
		Quadrado obj2 = new Quadrado();
		obj2.recebeLado();
		obj2.calArea();
		obj2.retornaLado();
		obj2.retornaArea();
		obj2.listaAtributos();
		
		Retangulo obj3 = new Retangulo();
		obj3.recebeAltura();
		obj3.recebeBase();
		obj3.calArea();
		obj3.retornaAltura();
		obj3.retornaBase();
		obj3.retornaArea();
		obj3.listaAtributos();
		
		Losango obj4 = new Losango();
		obj4.recebeDiagonalMaior();
		obj4.recebeDiagonalMenor();
		obj4.calArea();
		obj4.retornaDiagonalMaior();
		obj4.retornaDiagonalMenor();
		obj4.retornaArea();
		obj4.listaAtributos();
		
		Pentagono obj5 = new Pentagono();
		obj5.recebeApotema();
		obj5.recebeLado();
		obj5.calArea();
		obj5.retornaApotema();
		obj5.retornaLado();
		obj5.retornaArea();
		obj5.listaAtributos();
		
		Hexagono obj6 = new Hexagono();
		obj6.recebeLado();
		obj6.calArea();
		obj6.retornaLado();
		obj6.retornaArea();
		obj6.listaAtributos();
		
		Circulo obj7 = new Circulo();
		obj7.recebeRaio();
		obj7.calArea();
		obj7.retornaRaio();
		obj7.retornaArea();
		obj7.listaAtributos();
		
		Trapezio obj8 = new Trapezio();
		obj8.recebeAltura();
		obj8.recebeBaseMenor();
		obj8.recebeBaseMaior();
		obj8.calArea();
		obj8.retornaAltura();
		obj8.retornaBaseMenor();
		obj8.retornaBaseMaior();
		obj8.retornaArea();
		obj8.listaAtributos();
		
		Paralelogramo obj9 = new Paralelogramo();
		obj9.recebeAltura();
		obj9.recebeBase();
		obj9.calArea();
		obj9.retornaAltura();
		obj9.retornaBase();
		obj9.retornaArea();
		obj9.listaAtributos();
		
		Cubo obj10 = new Cubo();
		obj10.recebeAresta();
		obj10.calcAreaSuperficie();
		obj10.calcVolume();
		obj10.retornaAresta();
		obj10.retornaAreaSuperficie();
		obj10.retornaVolume();
		obj10.listaAtributos();
	}
}
