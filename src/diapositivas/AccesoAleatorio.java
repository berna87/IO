package diapositivas;

import java.io.RandomAccessFile;

public class AccesoAleatorio {

	public static void main(String[] args) {
		//definimos el fichero de acceso aleatorio
		String path = "/home/matinal/codigo/aleatorio";
		//usando jdk 1.7 no es necesario cerrar el flujo
		try (RandomAccessFile fichero = new RandomAccessFile(path, "rw");){
			//posicion inicial del puntero, siempre en 0
			//todo lo que escribamos se reescribe
			System.out.println("Posicion del puntero inicialmente : "+fichero.getFilePointer());
			System.out.println("Tamaño del fichero inicialmente : "+fichero.length());
			//posicionamos el puntero en la ultima posicion del fichero
			fichero.seek(fichero.length());
			for (int i = 0; i < 100; i++) {
				fichero.write(i);
			}
			System.out.println("Tamaño del archivo : "+fichero.length());
			System.out.println("Posicion del puntero : "+fichero.getFilePointer());
			//cambiamos la posicion del puntero
			fichero.seek(0);
			System.out.println("Valor del byte en la posicion 0 : "+fichero.read());
			fichero.seek(1);
			System.out.println("Valor del byte en la posicion 1 : "+fichero.read());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
