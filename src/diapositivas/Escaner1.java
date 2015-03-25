package diapositivas;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Escaner1 {

	public static void main(String[] args) {
		String path = "/home/matinal/codigo/copiado";
		//primero leemos un archivo
		File inFile = new File(path);
		try(Scanner in = new Scanner(inFile,"UTF-8");){ //indicamos el tipo de codificacion del archivo
			String valorLeido;
			while(in.hasNext()){
				valorLeido = in.next();
				System.out.println(valorLeido);
			}
				
		} catch (IOException ex){
			ex.printStackTrace();
		}

	}

}
