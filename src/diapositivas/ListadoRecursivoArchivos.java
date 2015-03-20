package diapositivas;

import java.io.File;

public class ListadoRecursivoArchivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long inicio =System.nanoTime();
		if(args.length==0){	
			System.out.println("No hay argumentos");
			System.exit(1);
		}
		File fichero = new File(args[0]);
		if(fichero.isDirectory())
			listarArchivosRecursivamente(fichero);
		else System.out.println(fichero.getAbsolutePath());
		long fin =System.nanoTime();
		System.out.println("Tiempo ejecucion : "+(fin-inicio)/1000000+" ms");
	}
	public static void listarArchivosRecursivamente(File fichero){
		File[] listaArchivos = fichero.listFiles();
		for (File file : listaArchivos) {
			if(file.isDirectory()) listarArchivosRecursivamente(file);
			System.out.println(file.getAbsolutePath());
		}
	}
}
