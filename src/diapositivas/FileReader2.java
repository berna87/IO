package diapositivas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader2 {
	public static void main(String[] args) {
		String pathIn = "/home/matinal/codigo/nombres_mujer.txt";
		String pathOut = "/home/matinal/codigo/copiado";
		File inFile = new File(pathIn);
		File outFile = new File(pathOut);
		//el stream elegido es FileReader, lo envolvemos con BufferedReader para mejorar rendimiento
		//lectura
		try(BufferedReader in = new BufferedReader(new FileReader(inFile));
			BufferedWriter out = new BufferedWriter(new FileWriter(outFile))){
			String fraseLeida;
			while((fraseLeida=in.readLine())!=null) 
				out.write(fraseLeida+"\n");
		} catch(IOException ex){
			ex.printStackTrace();
		}
		System.out.println("Ha terminado el programa");

	}
}
