package diapositivas;

import java.io.File;
import java.io.FilenameFilter;

public class FicherosFiltrados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==0){	
			System.out.println("No hay argumentos");
			System.exit(1);
		}
		//creamos el objeto File
		File directorio = new File(args[0]);
		//filtro para archivos
		if(directorio.isDirectory()){
			String[] archivos = directorio.list(new FilenameFilter(){
				@Override
				public boolean accept(File directorio, String name) {
					// TODO Auto-generated method stub
					return name.endsWith(".java") || name.endsWith(".class");
				}	
			}); //clase interna anonima de FilenameFilter
			//imprimimos valores
			for (int i = 0; i < archivos.length; i++) {
				System.out.println("Nombre del archivo : "+archivos[i]);
			}
		}
	}

}
