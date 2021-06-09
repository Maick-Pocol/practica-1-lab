import java.util.*;
import java.lang.*;
import java.io.*;

public class ejercicio4 {

	public static void main (String[] args) throws IOException  {
		//declaramos variables
		int x, cuadrado, cubo;
		// iniciamos

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	  	System.out.println("Ingresa x: ");
	  		x = Integer.parseInt(br.readLine());

	  	cuadrado = x * x;
	  	cubo = x * x * x;

	  	System.out.println("El cuadrado es: "+cuadrado);
	  	System.out.println("Eel cubo es "+cubo);
	  	
	  }
}