import java.util.*;

public class ejercicio10 {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("calcular el area y perimetro de un rectangulo");

		System.out.println("cuanto mide la base del rectangulo");
		int base = sc.nextInt();

		System.out.println("cuanto mide la haltura del rectangulo");
		int altura = sc.nextInt();

		int area = base * altura;
		int perimetro = base * 2 + altura * 2;

		System.out.println("el area del rectangulo es: "+area+ "\n" + "y su perimetro es: "+perimetro);
	}
}