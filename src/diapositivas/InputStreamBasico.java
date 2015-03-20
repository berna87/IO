package diapositivas;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringBufferInputStream;

public class InputStreamBasico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "esto es una frase";
		//convertimos la frase a un flujo de bytes
		StringBufferInputStream in = new StringBufferInputStream(frase);
		int c=0;
		while((c=in.read())!=-1){
			System.out.println(c+" "+(char)c);
		}
		try {
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Frase 2 :");
		String frase2 = "esto es otra frase";
		//convertimos la frase a un array de bytes
		byte[] arrayBytes = frase2.getBytes();
		ByteArrayInputStream in2 = new ByteArrayInputStream(arrayBytes,2,10);
		while((c=in2.read())!=-1){
			System.out.println(c+" "+(char)c);
		}
		try {
			in2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
