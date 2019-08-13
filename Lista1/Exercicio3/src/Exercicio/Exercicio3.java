package Exercicio;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int numero;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um numero inteiro: ");
		numero = entrada.nextInt();
		System.out.print("O numero convertido em binário: "+converteInteiroParaBinario(numero));
	}
	
	public static String converteInteiroParaBinario(int valor) {
		String binario = Integer.toBinaryString(valor);
		return binario;		
	}
	
}
