package diapositivas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploFileReader {

	public static void main(String[] args) {
		String pathIn = "/home/matinal/codigo/nombres_mujer.txt";
		String pathOut = "/home/matinal/codigo/copiado";
		File inFile = new File(pathIn);
		File outFile = new File(pathOut);
		//el stream elegido es FileReader, lo envolvemos con BufferedReader para mejorar rendimiento
		BufferedReader in = null;
		BufferedWriter out = null;
		//lectura
		int c;
		try {
			in = new BufferedReader(new FileReader(inFile));
			out = new BufferedWriter(new FileWriter(outFile));
			while ((c=in.read())!=-1)
				out.write(c);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			if(in!=null)
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

}
