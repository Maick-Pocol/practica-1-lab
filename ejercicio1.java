import java.util.*;

public class ejercicio1 {

	public static void main(String[] args)
	  {
	  	double num1,num2,resultado;

	  	Scanner Teclado = new Scanner (System.in);

	  	System.out.println("inserta primer numero");
	  	num1=Teclado.nextDouble();

	  	System.out.println("inserte segundo numero");
	  	num2=Teclado.nextDouble();

	  	resultado=num1+num2;

	  	System.out.println("el resultado es"+resultado);

	  }
}