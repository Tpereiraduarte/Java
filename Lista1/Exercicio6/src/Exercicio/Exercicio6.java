package Exercicio;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		System.out.print("Digite uma palavra e veja se é um palindromo: ");
		Scanner entrada = new Scanner(System.in);
		String palavra = entrada.next();
		String resposta = verificaPalindromo(palavra);
		if(resposta.trim().equals(palavra)) {
			System.out.println("Essa palavra é um palindromo");			
		}else {
			System.out.println("Essa palavra não é um palindromo");
		}
	}
	public static String verificaPalindromo(String palavra) {
		String invertida = new StringBuilder(palavra).reverse().toString();
		return invertida;
	}

}
