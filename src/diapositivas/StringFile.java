package diapositivas;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StringFile {
	public static void main(String[] args) {
		//primero convertimos un string en un array de bytes
		String frase = "Esto es una frase\n 嗨 嗨 嗨 \n";
		byte[] array = frase.getBytes();
		//creamos el inputStream
		ByteArrayInputStream in = new ByteArrayInputStream(array);
		//ahora volcamos el flujo de bytes (stream) a un archivo
		//primero se crea un archivo
		String path = "/home/matinal/codigo/out.txt";
		File outFile = new File(path);
		//ahora creamos el flujo de bytes de salida outputstream
		FileOutputStream out=null;
		try {
			out = new FileOutputStream(outFile);
			//volcamos los bytes dentro del fichero out
			int c;
			while((c=in.read())!=-1){
				out.write(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(out != null)
				try {
					out.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			if(in != null)
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
}
