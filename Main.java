package u6u7.entregable;

import java.util.Scanner;
import u6u7.entregable.Artista.estilo;
import u6u7.entregable.Festival.EstiloNoCoindideException;

public class Main {
	
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		IntroducirMusico introducir = new IntroducirMusico();
		ImprimeMusico imprimir = new ImprimeMusico();
		Manager manager1 = new Manager("Antonio","625987645");
		Artista artista1 = new Artista(estilo.indie , "juan", 5, manager1);
		Artista artista2 = new Artista(estilo.pop, "jose", 6, manager1);
		Artista artista3 = new Artista(estilo.pop, "pepe", 7, manager1);
		Festival festival1 = new Festival("Evento1",95854);
		
		introducir.introducirMusico();
		imprimir.cargar_musicos();
		imprimir.imprimeMusico();
			
		try {
			festival1.inscribeArtista(estilo.indie, artista1);
			festival1.inscribeArtista(estilo.pop, artista3);
			festival1.inscribeArtista(estilo.rock, artista2);
		}catch (EstiloNoCoindideException e){
			System.out.println("Se ha producido una excepción: " + e.getMessage());		
		}
		
		festival1.cuantosInscritos();
	}

}
