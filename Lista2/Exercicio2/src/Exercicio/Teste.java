package Exercicio;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Exercicio.Data;

public class Teste {

	public static void main(String[] args) throws ParseException {
		Data novaData = new Data(10,05,2000);
		novaData.getMesExtenso();
		novaData.isBissesto(novaData.getAno());
		novaData.compara(novaData.getData());
	}

}
