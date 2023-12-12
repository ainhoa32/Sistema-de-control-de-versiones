package sistema_de_control_de_versiones;

import java.util.Scanner;

public class sistemaControl {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce un altura: ");
		int altura = entrada.nextInt();
		System.out.println("Introduce otro base: ");
		int base = entrada.nextInt();
		System.out.println("el area del triangulo es : "+calcularArea(base,altura));
	}public static double calcularArea(int base, int altura) {
		return base * altura / 2;
	}

}
