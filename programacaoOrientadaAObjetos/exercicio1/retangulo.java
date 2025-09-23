package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		System.out.println("Entre com a largura do retangulo: ");
		System.out.print("Largura: ");
		rectangle.width = sc.nextDouble();
		System.out.println("Entre com a altura do retângulo: ");
		System.out.print("Altura: ");
		rectangle.height = sc.nextDouble();
		
		System.out.printf("Area = %.2f%n", rectangle.area());
		System.out.printf("Perimetro = %.2f%n", rectangle.perimeter());
		System.out.printf("diagonal = %.2f%n", rectangle.diagonal());
		
		sc.close();
	}

}
