package Datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException {

		Date date = new Date();
		System.out.println("//A data em milisegundos " + date.getTime());

		System.out.println("Dia do mês " + date.getDate());

		System.out.println("Dia da semana " + date.getDay());

		System.out.println("Hora do dia " + date.getHours());

		System.out.println("Minutos da hora " + date.getMinutes());

		System.out.println("Segundos " + date.getSeconds());

		System.out.println("Ano " + (date.getYear() + 1900)); // No ano o Java tem como base o ano de 1900, ele subtrai
																// este valor antes de executar, por isso se faz +1900

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.s");

		System.out.println("Data atual em formato padrão e String" + simpleDateFormat.format(date));

		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.s");

		System.out.println("Data em formato para banco de dados " + simpleDateFormat.format(date));

		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

		System.out.println("Objeto date " + simpleDateFormat.parseObject("2022-03-03 "));

		simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

		System.out.println("Objeto date " + simpleDateFormat.parseObject("03-03-2022"));
	}
}
