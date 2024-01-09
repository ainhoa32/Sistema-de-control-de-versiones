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
		System.out.println("Introduce el radio: ");
		int radio = entrada.nextInt();
		System.out.println("el area de la circunferencia es: "+calaACirc(radio));
		System.out.println("el perimetro de la circunferencia es : "+perimetroACirc(radio));
		
		System.out.println("Introduce la altura para el cilindro: ");
		int alturaCil = entrada.nextInt();
		
		System.out.println("Introduce la radio para el cilindro: ");
		int radioCil = entrada.nextInt();
		System.out.println("El área del cilindro es: " + areaCilindro(alturaCil, radioCil));
		
		System.out.println("introduce el lado 1 del rectangulo");
		int lado1rec=entrada.nextInt();
		System.out.println("introduce el lado 2 del rectangulo");
		int lado2rec=entrada.nextInt();
		System.out.println("el area del rectangulo es : "+areaRectangulo(lado1rec,lado2rec));
		System.out.println("Introduce el lado del cubo: ");
		int ladoCubo = entrada.nextInt();
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
	}public static double areaCilindro(int alturaCil, int radioCil) {
		return 2*3.14* alturaCil + 2*3.14* radioCil;
	}
	public static double areaRectangulo(int lado1rec,int lado2rec) {
		return ((lado1rec*2) + (lado2rec*2));
	}public static double volCubo(int ladoCubo) {
		return ladoCubo^3;
	}
	//merge desde master a ainhoa para llevar lo de ainhoa al master
	//holasaa
}
