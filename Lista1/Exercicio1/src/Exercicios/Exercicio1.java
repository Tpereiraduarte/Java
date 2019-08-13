package Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		ArrayList<Double> listaSalariosAtual = new ArrayList<>();
		ArrayList<Double> listaSalariosReajustado = new ArrayList<>();
		ArrayList<String> listaNomes = new ArrayList<>();
		String nome;
		double salario = 0, totalSalario = 0, totalReajuste = 0, diferenca = 0;
		
		do {
			nome = getNome();
			if(!nome.contains("fim")) {
				salario = getSalario();
				listaNomes.add(nome);   
				listaSalariosAtual.add(salario);
				listaSalariosReajustado.add(calcularReajuste(salario));
				totalSalario += salario;
				totalReajuste += calcularReajuste(salario);
			}
		} while (!nome.contains("fim"));
		
		System.out.println("Soma total dos salários: "+totalSalario);	
		System.out.println("Soma total dos salário com reajuste: "+totalReajuste);
		System.out.println("Diferença entre os salários: "+(diferenca = totalReajuste - totalSalario));
	}
	public static String getNome() {
		System.out.print("Digite o Nome do Funcionário: ");
		Scanner entrada = new Scanner(System.in);
		return entrada.next();
	}
	
	public static double getSalario() {
		System.out.print("Digite o salário do Funcionário: ");
		Scanner entrada = new Scanner(System.in);
		return entrada.nextFloat();
	}
	
	public static double calcularReajuste(double valor) {
		if(valor <= 150) {
			valor += valor * 0.25;
		}else if(valor <= 300) {
			valor += valor * 0.20;
		}else if(valor <= 600) {
			valor += valor * 0.15;
		}else {
			valor += valor * 0.10;
		}		
		return valor;
	}
}
