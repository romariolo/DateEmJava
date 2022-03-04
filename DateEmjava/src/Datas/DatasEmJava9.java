package Datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;

public class DatasEmJava9 {

	public static void main(String[] args) throws ParseException {

		LocalDate dataAntiga = LocalDate.of(2010, 3, 18);
		
		LocalDate dataNova = LocalDate.of(2022, 5, 21);
		
		System.out.println("Data antiga é maior que data nova :"+dataAntiga.isAfter(dataNova));
		
		System.out.println("Data antiga é anterior a data nova :"+dataAntiga.isBefore(dataNova));
		
		System.out.println("Datas são igais :"+dataAntiga.isEqual(dataNova));
		
		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println("Dias entre o periodo : "+periodo.getDays());
		
		System.out.println("Meses entre o periodo : "+periodo.getMonths());
		
		System.out.println("Total de meses : "+periodo.toTotalMonths());
		
		System.out.println("Anos entre o periodo : "+periodo.getYears());
		
		System.out.println("Periodo entre as datas :"+periodo.getYears() +" anos "+periodo.getMonths()+
				" meses "+periodo.getDays()+" dias ");
		
	}

}
