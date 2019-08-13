package Exercicio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	private String data;
	private String mesExtenso;
	
	
	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		isValid(this.dia, this.mes, this.ano);
		
	}
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAno() {
		return ano;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public void setMesExtenso(String mesExtenso) {
		this.mesExtenso = mesExtenso;
	}
	public String getMesExtenso() {
		switch (this.mes) {
		case 1:
			mesExtenso = "janeiro";
			break;
		case 2:
			mesExtenso = "fevereiro";
			break;
		case 3:
			mesExtenso = "março";
			break;
		case 4:
			mesExtenso = "abril";
			break;
		case 5:
			mesExtenso = "maio";
			break;
		case 6:
			mesExtenso = "junho";
			break;
		case 7:
			mesExtenso = "julho";
			break;
		case 8:
			mesExtenso = "agosto";
			break;
		case 9:
			mesExtenso = "setembro";
			break;
		case 10:
			mesExtenso = "outubro";
			break;
		case 11:
			mesExtenso = "novembro";
			break;
		case 12:
			mesExtenso = "dezembro";
			break;
		default:
			return "esse mes não existe";
		}
		return mesExtenso;
	}

	public boolean isBissesto(int ano) {
		if(ano % 400 == 0 || ano % 4 == 0 && ano % 100 !=0) {
			return false;
		}
		return true;
	}
	
	public String isValid(int dia, int mes, int ano) {
		if(dia>0 && dia<32 && mes>0 && mes<13 && ano>0 && 
		  ((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) || 
     	  ((mes==4 || mes==6 || mes==9 || mes==11) && dia<=30) || 
     	  (mes==2 && (dia<=29 && ano % 4 == 0 && (ano%100!=0 || ano%400==0))|| dia<=28))){
			this.setData(""+dia+"/"+mes+"/"+ano+"");
			return this.getData();
	    }else{
	    	this.setData("01/01/0001");
	    	return this.getData();
	    }  
	}
	
	public  int compara(String data) throws ParseException {
		Date dataAtual = new Date();
		SimpleDateFormat formatador =  new SimpleDateFormat("dd/MM/yyyy");		
		Date dataParamentro = formatador.parse(data);

		if(dataAtual.compareTo(dataParamentro) == 0) {
			return 0;
		}else if(dataAtual.after(dataParamentro)) {
			 return 1;
		 }else {
			 return -1;
		 }
	}
}
