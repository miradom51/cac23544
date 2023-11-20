package ar.com.codoacodo;

public class MainAuto {

	public static void main(String[] args) {
		// crear un auto a partir de la clase auto hay nace el objeto
		Auto clio = new Auto("Renault", "clio", "Azul", 2020,2f);
		
		
		//clio es un objeto de la clase auto.
		clio.encender();
		clio.encender();
		clio.acelerar();
		clio.acelerar();
		clio.acelerar();
	}

}
