package mx.com.cetech.Clase11.TemaFinally;

public class CalcularTresSum extends CalcularDosSum {
	
	int c = 25;
	
	public void encontrarTresSum (){
		int resultadoDos = encontrarDosSum() + c;
		
		System.out.println("Resultado = " + resultadoDos);
		
	}

}
