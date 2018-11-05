package mx.com.cetech.Clase11.Ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class LeerFichero {

	public static void main(String[] args) 
	{
	File archivo;
	FileReader leerArchivo = null;
	
	try {
		archivo = new File("C:\\Users\\Alexis\\Desktop\\miArchivo.txt");
		leerArchivo = new FileReader(archivo);
		
		BufferedReader memoriaParaLectura = new BufferedReader(leerArchivo);
		
		String linea = null;
		
		while((linea = memoriaParaLectura.readLine()) != null){
			System.out.println(linea);
		}
		
		
	}catch(Exception e){
		JOptionPane.showMessageDialog(null, e.getMessage());
		
	}finally {
		
		try { if (leerArchivo != null){
			leerArchivo.close();
		}
			
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, e2.getMessage());
		}
		
		
	}
		// TODO: handle finally clause
	}

	}


