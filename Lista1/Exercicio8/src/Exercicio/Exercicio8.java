package Exercicio;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		System.out.print("Digite um numero inteiro e veja se é um numero primo: ");
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		
		if(numeroPrimo(numero) ) {
			System.out.println("\nNumero "+ numero +" é primo");				
		}else {
			System.out.println("Numero "+ numero +" não é primo");
		}
	}
	
	public static boolean numeroPrimo(int valor) {
        int numeroDiversores = 0;
		for (int i = 1; i <=  valor; i++) {
            if (valor % i == 0) {
            	System.out.print(i+", ");
            	numeroDiversores++;               	
            }
        }
		
		if(numeroDiversores == 2) {
			return true;
		}else {
			return false;
		}
    }
}