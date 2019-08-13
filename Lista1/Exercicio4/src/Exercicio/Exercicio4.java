package Exercicio;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int numero;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um numero inteiro: ");
		numero = entrada.nextInt();
		for (int i = 0; i < numero; i++) {
			if(numero == calculoFibonacci(i)) {
				System.out.println("Esse numero faz parte da sequência de fibonnaci");
			}
		}

	}
	public static Integer calculoFibonacci(int valor) {
		if(valor < 2) {
			return valor;
		}else {
			return calculoFibonacci(valor-1) + calculoFibonacci(valor -2);
		}
	}

}
