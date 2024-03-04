package u6u7.entregable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ImprimeMusico {
	
	ArrayList <Musico> listaMusicos = new ArrayList<>();
	
	public void cargar_musicos() {
		try(ObjectInputStream fichero = new ObjectInputStream(new FileInputStream("musicos.dat"))){
			listaMusicos = (ArrayList<Musico>) fichero.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void imprimeMusico (){
		for(Musico m : listaMusicos) {
			System.out.println(m.getNombreArtistico()+" "+m.getEdad());
		}
			
	}

}
