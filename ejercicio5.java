import java.util.*;

public class ejercicio5 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog (null, "suma de una constante y una variable");
		//se crea cuadro de dailogo de bienvenida
		String a;  //se crea una variable tipo cadena
		int uno=1; //se crea una constante
		int dos, tres;
		a=JOptionpane.showInputDialog("ingrese el numero");
		dos=Integer.parseInt(a); //se convierte el valor a entero
		tres=uno+dos;  //calculo de la suma
		JOptionPane.showMessageDialog (null, "la suma es: "+tres);
	  	
	  }
}