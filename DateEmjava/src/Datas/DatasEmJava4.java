package Datas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DatasEmJava4 {

	public static void main(String[] args) {

	long dias = ChronoUnit.DAYS.between(LocalDate.parse("2022-02-01"), LocalDate.now());	
     	
	System.out.println("Possui " +dias +  " dias entre as datas");
	}
	/*Usado para saber quantos dias um boleto tem de vencido, por exemplo*/

}
