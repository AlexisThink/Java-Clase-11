package mx.com.cetech.Clase11.ExpresionesRegulares;

import javax.swing.JOptionPane;

public class ExpresionesRegulares {

	public static void main(String[] args) 
	{
		/*
		 * SIRVE PARA LAS VALIDACIONES DE CIERTO DATOS EN NUESTROS CAMPOS DE TEXTO, PRA STO USAREMOS EXPRESIONES REGULARES
		 * LO CUAL NOS FACILITA REALIZAR EL RECONOCIMIENTO DE CIERTOS PATRONES EN EL TEXTO Y ASI VEREFICAR SI UN TEXTO DE 
		 * ENTRADA ES EL CORRECTO O NO LO ES
		 */

		//PAREDAR
		
		/*String edad = JOptionPane.showInputDialog("INGRESA TU EDAD");
		
		//if(edad.matches("[5-9]{1,2}")){
		
		if(edad.matches("[1-9]{1}([0-9]{1,2})?")){
			JOptionPane.showMessageDialog(null, "Correcto");
			
			//MATCHES-> EXPRESION REGULR
			
			//[0-9] -> SOLO EXPRESA NUMEROS DEL 0 AL 9
			
			//{1,2} -> CANTIDAD MINIMA O MAXIMA 2
			  
			 //? LO CONVIERTE EN OPCINAL
		}
		else{
			JOptionPane.showMessageDialog(null, "INCORRECTO");
		}*/
		
		//PARA EL CORREO ELECTRONICO
		
		String correo = JOptionPane.showInputDialog("INGRESA TU CORREO");
		
		//if(edad.matches("[5-9]{1,2}")){
		
		//if(correo.matches("[a-zA-Z0-9]+\\@[a-zA-Z]+\\.[a-zA-Z]+")){
		
		//[a-zA-Z0-9] -> Se puede usar a a la z minuscula o A a la Z mayuscula o tambien del 0 al 9
		
		//CON EL SIGNO DE MAS, DEBE DE HABER UNO O MAS ELEMENTOS ANTE QUE EL
		
		//[-_.] -> SE PUEDE PONER-,_ Y .
		
		//* EXITE O NO EXISTE; PUED O NO HBER (DE 0 A  MUCHOS)
		
		//CARACTER EPECIL OBLIGATORIO -> \\
		
		//if(correo.matches("[a-zA-Z0-9]+[-_.]*+\\@[a-zA-Z]+\\.[a-zA-Z]+")){
		
		if(correo.matches("[1-3]{1}[0-9]{1}+\\/[0-1]{1}[0-9]{1}+\\/[0-9]{4}")){
			JOptionPane.showMessageDialog(null, "Correcto");
			
			//MATCHES-> EXPRESION REGULR
			
			//[0-9] -> SOLO EXPRESA NUMEROS DEL 0 AL 9
			
			//{1,2} -> CANTIDAD MINIMA O MAXIMA 2
			  
			 //? LO CONVIERTE EN OPCINAL
			
			/*
			 * EJERCICIO DE TELEFONO
			 * 
			 * LDA DE 2 0 3 
			 * GUION DE SEPRACION
			 * 
			 * CAA O CELULAR
			 * 
			 * 
			 * EJERCICIO DINERO
			 * 
			 * 
			 * NO PUEDE EMPEZAR CON 0
			 * ENTAVOS OPCIONAL
			 * 
			 * 
			 * */
			
		}
		else{
			JOptionPane.showMessageDialog(null, "INCORRECTO");
		}
		
	}

}




