package Exercicio;

public class Aluno {

	private String matricula;
	private String nome;
	private double notas[] = new double [2];
	private double notaTrabalho;

	public double media(double prova[],double trabalho) {
		double media = 0, soma = 0;
		for (int i = 0; i < prova.length; i++) {
			soma += (prova[i] / 2.5);
		}
		media = (soma + ((trabalho /2 )) / 7);
		return media;
	}
	
	public double notaFinal(double prova[],double trabalho) {
		double media = 0, notaTrabalho = 0, notaProva = 0, resultado = 10;
		
		notaTrabalho = trabalho / 2;
		
		for (int i = 0; i < prova.length; i++) {
			notaProva += (prova[i] / 2.5);		
		}
		
		media = (notaTrabalho + notaProva) / 3;
		
		if(media > 5) {
			resultado -= media;
			return resultado;
		}
		return 0;			
	}
	
}
