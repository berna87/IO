package diapositivas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter1 {

	public static void main(String[] args) {
		String texto="texto que vamos a enviar a un fichero\n";
		String pathIn = "/home/matinal/codigo/nombres_mujer.txt";
		String pathOut = "/home/matinal/codigo/copiado";
		File inFile = new File(pathIn);
		File outFile = new File(pathOut);
		//añadir a un flujo de salida el String texto y las diez primeras lineas del inFile
		try(BufferedReader in = new BufferedReader(new FileReader(inFile));
			PrintWriter out = new PrintWriter(outFile)){
			out.write(texto);
			String lineaLeida;
			for (int i = 0; i < 10; i++) {
				lineaLeida=in.readLine();
				if(lineaLeida==null)
					break;
				out.write(lineaLeida+"\n");
			}
			
		}catch(IOException ex){
			ex.printStackTrace();
		}
		System.out.println("Ha terminado el programa");
	}

}
