import java.util.*;

public class ejercicio8 {

	public static void main(String[] args) {

		Scanner Teclado=new Scanner(System.in);
		double num1,num2,num3,promedio;
		String calculo;

		System.out.println("calculo: ");
		calculo=Teclado.nextLine();
		System.out.println("ingrese numero 1: ");
		num1=Teclado.nextDouble();
		System.out.println("ingrese numero 2: ");
		num2=Teclado.nextDouble();
		System.out.println("ingrese numero 3: ");
		num3=Teclado.nextDouble();
		promedio=(num1+num2+num3)/3;
		System.out.println("el promedio final del calculo: "+calculo+" es de: "+promedio);


	}
}