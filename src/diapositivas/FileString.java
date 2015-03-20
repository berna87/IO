package diapositivas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileString {

	public static void main(String[] args) {
		//primero creamos un objeto de tipo File
		String path = "/home/matinal/codigo/out.txt";
		File inFile = new File(path);
		//recepcionamos un flujo de byte desde un archivo
		FileInputStream in = null;
		String textoARecibir="";
		try {
			in = new FileInputStream(inFile);
			int c;
			while((c=in.read())!=-1)
				textoARecibir+=(char)c;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(in!=null)
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		System.out.println(textoARecibir);
		

	}

}
