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

		System.out.println("el area del trianfulo es"+calcularArea(base,altura));
		System.out.println("Introduce el radio: ");
		int radio = entrada.nextInt();
		System.out.println("el area de la circunferencia es: "+calaACirc(radio));
		System.out.println("el perimetro de la circunferencia es : "+perimetroACirc(radio));

	}public static double calcularArea(int base, int altura) {
		return base * altura / 2;
	}public static double calaACirc(int radio) {
		double area;
		double pi=3.14;
		area=pi*(radio*radio);
		return area;
	}public static double perimetroACirc(int radio) {
		double pi=3.14;
		double perimetro;
		perimetro=2*(pi*radio);
		return perimetro;
}
}
