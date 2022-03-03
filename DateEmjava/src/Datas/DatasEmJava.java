package Datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat simpleDtaeFormat = new SimpleDateFormat("dd/MM/yyyy");

		Date vencimentoBoleto = simpleDtaeFormat.parse("01/04/2022");

		Date dataAtual = simpleDtaeFormat.parse("03/03/2022");

		if (vencimentoBoleto.after(dataAtual)) {

			System.out.println("Boleto não vencido.");

		} else {
			System.out.println("Boleto vencido.");
		}

	}
}