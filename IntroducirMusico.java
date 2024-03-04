package u6u7.entregable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class IntroducirMusico {

	ArrayList <Musico> listaMusicos = new ArrayList<>();
	
	public void introducirMusico() {
		Scanner sc = new Scanner (System.in);
		
		boolean introducir = true;
		
		while (introducir) {
			System.out.println("Introduce el nombre y la edad de un músico");
			System.out.println("Nombre: ");
			String nombre = sc.next();
			System.out.println("Edad: ");
			int edad = sc.nextInt();
			addMusico(nombre,edad); //Paso los datos a la función addMusico
			System.out.println("Deseas insertar otro aspirante? [s/n]");
			String opcion = sc.next();
			if(opcion.equalsIgnoreCase("n")) {
				introducir = false;
			}
		}
		guardarFicheros();
	}
	
	public void addMusico (String nombre, int edad) {
		listaMusicos.add(new Musico(nombre, edad));
	}
	
	public void guardarFicheros() {
		
		try (ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream("musicos.dat"))){
			fichero.writeObject(listaMusicos);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
