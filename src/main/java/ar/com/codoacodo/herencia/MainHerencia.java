package ar.com.codoacodo.herencia;

public class MainHerencia {

	public static void main(String[] args) {
		//crear un articulo.
		Articulo a1 = new Articulo("titulo1", 150.5f,"http://url.com/bla1.jpg");
		
		//llamo  al setter
		a1.setAutor("autor a1");
		
		//metodos disponibles get y set
//		System.out.println(a1);
		
		
		//Hijo h = new Hijo().
		Musica m1 = new Musica("m1", 250.7f,"http://url.com/m1.jpg");
		m1.setAutor("autor m1");//esto es de articulo.
		String[] temas = new String[] {"t1","t2","t3"};
		m1.setTemas(temas);//esto es de musica.
		
//		System.out.println(m1);
		
		//Hijo pelicula
		Pelicula p1 = new Pelicula("peli1", 858f, "http://url.com/p1.jpg");
		p1.setAutor("Esteven Spilberg");
		p1.setProductora("Trescabezas");
		p1.setFormato("DVD");
		
//		System.out.println(p1);
		
		
		
		//Hijo Libro
		Libro l1 = new Libro("señor de los anillos", 584.2f,"http://url.com/l1.jpg");
		l1.setAutor("Morgan freeman");
		l1.setIsbn("12345l");
		
//		System.out.println(l1);
		
		
		//vector para guardar las instancias.
		Articulo[] resultados = new Articulo[4];
		resultados[0] = a1;
		resultados[1] = m1;
		resultados[2] = p1;
		resultados[3] = l1;
		
		
		for(Articulo aux : resultados) {
			System.out.println(aux);
		}
	}

	
}
