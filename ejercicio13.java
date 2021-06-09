import java.util.*;

public class ejercicio13 {

	public static void main(String [] args) {

		double radio;
		double altura;
		double area;
		double volumen;

		Scanner entrada =new Scanner(System.in);

		System.out.println("ingrese el radio del cilindro: ");
		radio = entrada.nextDouble();

		System.out.println("ingrese la altura del cilindro");
		altura = entrada.nextDouble();

		area = ((2) * (3.1416) * (radio)) * (altura*radio);
		volumen = ((3.1416)*(radio*radio))*altura;

		System.out.println("el area del cilindro es: "+area+" cm2");
		System.out.println("el volumen del cilindro es: "+volumen+" cm3");

	}
}