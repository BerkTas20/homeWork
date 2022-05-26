package homeWork;

import java.util.Scanner;

public class PatikaHomework6 {

	public static void main(String[] args) {
		double apple,pear,tomatoes,banana,eggplant,kilo;
		double result;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Armut Kaç Kilo? ");
		kilo = scanner.nextDouble();
		pear =  kilo * 2.14;
		
		System.out.println("Elma Kaç Kilo? ");
		kilo = scanner.nextDouble();
		apple =  kilo * 3.67;
		
		System.out.println("Domates Kaç Kilo? ");
		kilo = scanner.nextDouble();
		tomatoes =  kilo * 1.11;
		
		System.out.println("Muz Kaç Kilo? ");
		kilo = scanner.nextDouble();
		banana =  kilo * 0.95;
		
		System.out.println("Patlıcan Kaç Kilo? ");
		kilo = scanner.nextDouble();
		eggplant =  kilo * 5.00;
		
		
		System.out.println("Toplam Tutar: " +(pear + apple + tomatoes + banana + eggplant));
	}

}