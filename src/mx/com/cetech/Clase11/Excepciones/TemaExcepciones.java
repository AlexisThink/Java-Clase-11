package mx.com.cetech.Clase11.Excepciones;

public class TemaExcepciones {

	public static void main(String[] args) 
	{
		
		String arr [] = new String [3];
		
		
		int a = 0;
		int b = 6;
		
		try {
			System.out.println(b/a);
			System.out.println("Fin del Try");
			System.out.println(arr [5]);
		}catch(ArithmeticException er){
			System.out.println("Error aritmetico: " + er.getMessage());
		}
	catch(ArrayIndexOutOfBoundsException er){
		System.out.println("Error del Arreglo: " + er.getMessage());
	}
		catch (Exception e) {
			e.printStackTrace();
			
			System.out.println("Hahaha" + e.getMessage());
			
			
		}finally{
			System.out.println("BLOQUE FINALLY SIEMPRE SE VA A EJECUTAR");
		}
		System.out.println("Fin del Programa");
	}

}
