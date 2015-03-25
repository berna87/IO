package diapositivas;

import java.util.Scanner;

public class Escaner2 {

	public static void main(String[] args) {
		String frase= "Juan:Fernandez:22:true:222,22";
		Scanner in = new Scanner(frase);
		in.useDelimiter("\\s*:\\s*"); //para cubrirnos si se introduce algun espacio en blanco junto a uno de los delimitadores
		String nombre = in.next();
		String apellido = in.next();
		int edad = in.nextInt();
		boolean condicion = in.nextBoolean();
		double pago = in.nextDouble();
		System.out.println(nombre+" "+apellido);
		System.out.println("Edad : "+edad+"\tCondicion :"+condicion);
		System.out.println("Pago : "+pago);

	}

}
