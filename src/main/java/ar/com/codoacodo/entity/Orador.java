package ar.com.codoacodo.entity;

import java.time.LocalDate;

public class Orador {

	
	//atributos: encapsulamiento 
	private Long id;
	private String nombre;
	private String apellido;
	private String mail;
	private String tema;
	private LocalDate fechaAlta;
	
	
	
	//constructor/es
	//usar cuando voy a enviar un objeto a la BD.
	//ALT + SHIFT + S GEERACION AUTOMATICA
	public Orador(String nombre, String apellido, String mail, String tema, LocalDate fechaAlta) {
		init(nombre, apellido, mail, tema, fechaAlta);
	}


	//usamos para traer el objeto de la bd
		public Orador(Long id, String nombre, String apellido, String mail, String tema, LocalDate fechaAlta) {
			this.id = id;
			init(nombre, apellido, mail, tema, fechaAlta);
		}
	
		//alt+shift+m
	
	
	private void init(String nombre, String apellido, String mail, String tema, LocalDate fechaAlta) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.tema = tema;
		this.fechaAlta = fechaAlta;
	}


	//Implementar metodo toString()de la clase object
	//Otra forma de polimorfismo: sobre escritura.
	@Override
	public String toString() {
		return "Orador [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", mail=" + mail + ", tema="
				+ tema + ", fechaAlta=" + fechaAlta + "]";
	}

	
	
	//getters / setters
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		if(nombre != null) {
		this.nombre = nombre;
		}else {
			this.nombre = "N/D";
		}
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getTema() {
		return tema;
	}


	public void setTema(String tema) {
		this.tema = tema;
	}


	public LocalDate getFechaAlta() {
		return fechaAlta;
	}


	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}


	public Long getId() {
		return id;
	}

	
}
