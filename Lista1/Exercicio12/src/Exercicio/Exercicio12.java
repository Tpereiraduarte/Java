package Exercicio;

import java.util.Random;

public class Exercicio12 {

	public static void main(String[] args) {
		int pesos[] = new int[150];
		int menor = 0;
		
		for (int i = 0; i < pesos.length; i++) {
			Random aleatorio = new Random();
			int valor = aleatorio.nextInt(80) + 1;
			pesos[i] = valor;
			System.out.print(" "+ pesos[i]);
			System.out.print(",");
		}
		System.out.println("\n\n menor peso é "+ (menor = menorPeso(pesos)));
	}
	
	public static int menorPeso(int valor[]) {
		int menor = 0;
		menor = valor[0];
		for (int i = 0; i < valor.length; i++) {	
			if(valor[i] < menor ) {
				menor = valor[i];
			}
		}
		return menor;
	}

}
