package Exercicio;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		double salarios[] = new double[50];
		double media = 0;
		System.out.print("Digite a quantidade de funcionarios que deseja cadastrar: ");				
		Scanner entrada = new Scanner(System.in);
		int quantidade = entrada.nextInt();
		
		if(quantidade <= 50) {
			for (int i = 0; i < quantidade; i++) {
				System.out.print("Digite o salário do funcionario "+ (i + 1)+" :");				
				salarios[i] = getSalario();
			}
			System.out.println("A média dos salários: "+ (media = calculaMedia(salarios, quantidade)));
		}else {
			System.out.println("Não é possivel cadastrar mais de 50 funcionários");			
		}
		
	}
	
	public static double getSalario() {
		Scanner entrada = new Scanner(System.in);
		double salario = entrada.nextDouble();
		return salario;
	}
	
	public static double calculaMedia(double vetor[],int quantidade) {
		double resultado = 0, media = 0;
		for (int i = 0; i < quantidade; i++) {
			resultado += vetor[i];
		}
		media = (resultado / quantidade);
		return media;
	}

}
