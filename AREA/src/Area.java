import java.util.Scanner;

public class Area {

	public static void main (String [] args) {
		
		
		Scanner  scanner = new Scanner (System.in);
		
		System.out.println("Informe o número");
		Integer numero= scanner.nextInt ();
		
		
		Integer resultadoArea = numero * numero; 
		
		System.out.println("Area " + resultadoArea);
		
		
		
		
	}
}
