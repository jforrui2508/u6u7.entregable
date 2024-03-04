package u6u7.entregable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import u6u7.entregable.Artista.estilo;

public class Festival {

	String nombreEvento;
	int numeroPostal;
	HashMap<estilo, Artista> artistas = new HashMap<>();
	int artistaInscrito = 0;
	
	public Festival(String nombreEvento, int numeroPostal ) {
		this.nombreEvento=nombreEvento;
		this.numeroPostal=numeroPostal;
	}
	
	public void inscribeArtista(Enum<estilo> estilo , Artista a)throws EstiloNoCoindideException {
		int artistaInscrito = 0;
		if (estilo != a.estiloArtista) {
            throw new EstiloNoCoindideException("El estilo no coincide con el estilo del artista");
        }else {
		artistaInscrito++;
		this.artistaInscrito=artistaInscrito;
        }
	}
	
	public void cuantosInscritos() {
		System.out.println("Hay un total de "+artistaInscrito+" artistas inscritos");
	}
	
	class EstiloNoCoindideException extends Exception {
	    public EstiloNoCoindideException(String mensaje) {
	        super(mensaje);
	    }
	}
	
	

}
