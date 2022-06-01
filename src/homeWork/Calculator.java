package homeWork;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int number1,number2,select;
		
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("Ilk sayiyi giriniz");
		number1 = scanner.nextInt();
		
		System.out.println("Ikinci giriniz");
		number2 = scanner.nextInt();
		
		System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
		System.out.println("Seciminiz");
		select = scanner.nextInt();
		
		switch(select) {
		case 1:
			System.out.println("Toplama islemi sonucu: " + (number1 + number2));
			break;
		case 2:
			System.out.println("Çikarma islemi sonucu: " + (number1 - number2));
			break;
		case 3:
			System.out.println("Carpma islemi sonucu: " + (number1 * number2));
		case 4:
			System.out.println("Bolme islemi sonucu: " + (float)number1 / number2);
		}
	}

}
