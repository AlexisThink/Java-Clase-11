package mx.com.cetech.Clase11.Ficheros;

import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class EscribirFicheros {

	public static void main(String[] args) 
	{
		
FileWriter miArchivo = null;

PrintWriter escribirArchivo;

String texto = "Hola Mundo!";

try {
	miArchivo = new FileWriter("C:\\Users\\Alexis\\Desktop\\miArchivo.txt", false);
	
	//EL PARAMETRO TRUE ES PARA AGREGAR EL TEXTO AL FINAL DEL ARCHIVO EN CASO DE QUE EXISTA
	//SI SE DESEA REMPLAZAR EL ARCHIVO EXISTENTE SE QUIT EL PARAMETRO TRUE Y SE PONE FALSE
	
	escribirArchivo = new PrintWriter(miArchivo);
	escribirArchivo.println(texto);
	
	JOptionPane.showMessageDialog(null, "Texto Ingresado Correctamente");
} catch (Exception e) {
	JOptionPane.showMessageDialog(null, "ERROR AL HAER LA OPERACION");
}finally{
	try {
		if(miArchivo != null){
			miArchivo.close();
		}
	} catch (Exception e2) {
		JOptionPane.showMessageDialog(null, e2.getMessage());
	}
		
	} 
	}

}
