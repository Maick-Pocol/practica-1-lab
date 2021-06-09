import java.util.*;
import java.lang.*;
import java.io.*;

public class ejercicio3 {

	public static void main(String[] args){

		//iniciamos las variables para guardar valores
	  	int numero;
	  	int numero_doble;
	  	int numero_triple;

	  	System.out.println("Ingresa un numero para saber el doble y el triple");
	  	
	  	Scanner scan = new Scanner(System.in); //escaner para leer el teclado

	  	numero = scan.nextInt();

	  	numero_doble = numero * 2; //obtenemos el doble
	  	numero_triple = numero * 3; //obtenemos el triple

	  	System.out.println("El doble de "+ numero + " = " + numero_doble);
	  	System.out.println("El triple de " + numero + " = " + numero_triple);
	  	
	  }
}