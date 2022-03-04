package Datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatasEmJava6 {

	public static void main(String[] args) throws ParseException{

		LocalDate dataAtaul = LocalDate.now();
		
		System.out.println(" Data atual " +dataAtaul.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
	    LocalTime horaAtual = LocalTime.now();
	    
	    System.out.println("Hora atual " +horaAtual.format(DateTimeFormatter.ofPattern("HH:mm.s")));
	    
	    LocalDateTime dataHoraAtual = LocalDateTime.now();
	    
	    System.out.println("Data e hora atualizada "+ dataHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm.s")) );
		
		
	}

}
