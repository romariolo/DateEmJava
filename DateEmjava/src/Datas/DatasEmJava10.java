package Datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasEmJava10 {

	public static void main(String[] args) throws ParseException {

		LocalDate localDate = LocalDate.parse("2020-02-26");
		
		
		for(int data = 1; data <=12 ; data++) {
			
			localDate = localDate.plusMonths(1);
			
			System.out.println("Próximas parcelas : "+ localDate.format
					(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+" do mês "+ data );
			
		}
		
	}

}
