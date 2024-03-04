package u6u7.entregable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Artista implements Comparable, Serializable{
	
	String nombreArtista ;
	enum estilo{pop, rock, indie}
	Enum<estilo> estiloArtista;
	int cache;

	public Artista(Enum<estilo> estilo , String nombreArtista, int cache, Manager a) {
		this.nombreArtista=nombreArtista;
		this.cache=cache;
	}
	
	
	
	public String getNombreArtista() {
		return nombreArtista;
	}



	public void setNombreArtista(String nombreArtista) {
		this.nombreArtista = nombreArtista;
	}



	public Enum<estilo> getEstiloArtista() {
		return estiloArtista;
	}



	public void setEstiloArtista(Enum<estilo> estiloArtista) {
		this.estiloArtista = estiloArtista;
	}



	public int getCache() {
		return cache;
	}



	public void setCache(int cache) {
		this.cache = cache;
	}



	@Override
	public int compareTo(Object o) {
		Artista e = (Artista) o;
		return this.nombreArtista.compareTo(e.nombreArtista);
	}
	

}
