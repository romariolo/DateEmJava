package Datas;

import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println("//A data em milisegundos "+date.getTime());
		
		System.out.println("Dia do m�s "+date.getDate());
		
		System.out.println("Dia da semana "+date.getDay());
		
		System.out.println("Hora do dia "+date.getHours());
		
		System.out.println("Minutos da hora "+date.getMinutes());
		
		System.out.println("Segundos "+date.getSeconds());
		
		
		System.out.println("Ano "+(date.getYear()+1900));
	}
	
	
}