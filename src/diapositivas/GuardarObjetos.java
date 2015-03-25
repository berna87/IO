package diapositivas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GuardarObjetos {

	public static void main(String[] args) {
		List<Persona> lista=new ArrayList<Persona>();
		lista.add(new Persona("Pepe",18));
		lista.add(new Persona("Juan",21));
		lista.add(new Persona("Pedro",20));
		lista.add(new Persona("Jose",18));
		lista.add(new Persona("Manolo",22));
		//primero creamos un ObjectOutputStream
		try(ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream(
						new File("/home/matinal/codigo/binario.dat")));){
			out.writeObject(lista);
		}catch(IOException ex){
			ex.printStackTrace();
		}
		try(ObjectInputStream in = new ObjectInputStream(
				new FileInputStream(
						new File("/home/matinal/codigo/binario.dat")));){
			List<Persona> listaNueva = (List<Persona>) in.readObject();
			System.out.println("-------------");
			System.out.println(listaNueva);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
class Persona implements Serializable{ //si no se hace serializable no se pueden pasar estos objetos a un fichero binario
	private String nombre;
	private int edad;
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	@Override
	public String toString() {
		return "Persona: nombre=" + nombre + ", edad=" + edad + "\n";
	}
	
}