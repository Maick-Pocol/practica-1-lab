import java.util.*;

public class ejercicio9 {

	public static void main(String[] args) {

		Scanner e=new Scanner(System.in);
		int num1,num2, aux;
		System.out.println("ingrese el primer valor");
		num1=e.nextInt();
			System.out.println("ingrese el segundo valor");
		num2=e.nextInt();
		aux=num1;
		num1=num2;
		num2=aux;
		System.out.println("el valor de la primera variable es "+num1);
		System.out.println("el nuevo valor de la primera variable es "+num2);
		

	}
}