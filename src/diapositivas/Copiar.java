package diapositivas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copiar {
	public static void main(String[] args) {
		String pathIn = "/home/matinal/codigo/copia";
		String pathOut = "/home/matinal/codigo/copiado";
		File inFile = new File(pathIn);
		File outFile = new File(pathOut);
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			
			in = new FileInputStream(inFile);
			out = new FileOutputStream(outFile);
			int c;
			//controlamos el tiempo
			long inicio = System.nanoTime();
			while ((c=in.read())!=-1)
				out.write(c);
			long fin = System.nanoTime();
			System.out.println("Fichero copiado en : "+((fin-inicio)/1000000)+" milisegundos");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(in!=null)
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			if(out!=null)
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
