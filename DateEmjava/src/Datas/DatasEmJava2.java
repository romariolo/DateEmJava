package Datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DatasEmJava2 {

	public static void main(String[] args) throws ParseException {

		
		Calendar calendar = Calendar.getInstance(); //getInstance pega a data atual
		
		calendar.setTime(new SimpleDateFormat("dd/MM/yyyy").parse("03/03/2022"));
		
		calendar.add(Calendar.DAY_OF_MONTH, 5); //Data de hoje mais 5 dias
		
		System.out.println("Somando dia do mês "+new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()	));
		
		calendar.add(Calendar.MONTH, 2); // Data atual mais 2 meses
		
		System.out.println("Somando mês "+new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.YEAR, 3);
		
		System.out.println("Somando ano "+ new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
	}

}
