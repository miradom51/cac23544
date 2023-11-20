package ar.com.codoacodo;

public class Auto {

	/*atributos*/
	String marca;
	String modelo;
	String color;
	Integer anio; // puedo usar int
	Boolean encendido;
	Float velocidad;
	Float velocidadMaxima;
	
	
	
	/*constructor*/
	// this es un puntero que apunta a los atributos o metodos de una clase u objeto
	public Auto(
		String marca,
		String modelo,
		String color,
		Integer anio,
		Float velocidadMaxima
		){
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.anio = anio;
		this.velocidadMaxima = velocidadMaxima;
	
		this.encendido = Boolean.FALSE;
		this.velocidad = 0f;
	}
	
	/*metodos*/
	void encender() {
		//este metodo cambia el estado del encendido.
		if(!this.encendido) {
		this.encendido = Boolean.TRUE;
		} else {
			System.out.println("Ya esta encendido");
		}
	}
	
	void apagar() {
		if(this.encendido) {
			this.encendido = Boolean.FALSE;
			this.velocidad = 0f;
		  } else {
			  System.out.println("Esta apagado");
		  }
		}
	
	
	void acelerar() {
		if(this.encendido) {
			if(velocidad < velocidadMaxima) {
				this.velocidad++;
			} else {
				System.out.println("Llegaste a la maxima velocidad");
			}
		}else {
			System.out.println("Primero encende el auto para acelerar");
		}
	}
	
	
	void frenar() {
		if(this.encendido) {
			if(this.velocidad > 0) {
			this.velocidad--;
			}else {
				System.out.println("El auto llego a velocidad 0");
			}
		}else {
			System.out.println("Auto apagado, frenado");
		}
	}
	
	
	void frenarConGanas() {
		if(this.encendido) {
			while(this.velocidad > 0) {
				this.velocidad--;
			}
		}
	}
	
	
	
	
	}

