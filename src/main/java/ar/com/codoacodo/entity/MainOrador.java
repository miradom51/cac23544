package ar.com.codoacodo.entity;

import java.time.LocalDate;

public class MainOrador {

	public static void main(String[] args) {
		// crear un objeto d ela clase orador, que luego se enviara a la bd.
		Orador nuevoOrador = new Orador("Pablo","Cablan","cablan@correo.com","negocios y startups",LocalDate.now());

		System.out.println(nuevoOrador);
	}

}
