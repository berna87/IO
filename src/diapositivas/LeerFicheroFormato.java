package diapositivas;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LeerFicheroFormato {

	public static void main(String[] args) {
		String pathIn = "/home/matinal/codigo/nombres_mujer.txt";
		String pathOut = "/home/matinal/codigo/copiado";
		File inFile = new File(pathIn);
		File outFile = new File(pathOut);
		DataInputStream in = null;
		DataOutputStream out = null;
		try {
			in = new DataInputStream(new BufferedInputStream(new FileInputStream(inFile)));
			out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(outFile)));
			String leido ;
			while((leido=in.readLine())!=null) //no se usa porque tenemos clases de String para caracteres
				System.out.println(leido);
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
