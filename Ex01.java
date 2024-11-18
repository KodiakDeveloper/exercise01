package basicAlgorithms;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		// Retangle Area

		Double area, height, base;

		Scanner scan = new Scanner(System.in);

		System.out.println("Input base: ");

		base = scan.nextDouble();

		System.out.println("Input height: ");

		height = scan.nextDouble();

		scan.close();

		area = base * height;

		System.out.println("Area:  " + area + " m²");

	}

}
