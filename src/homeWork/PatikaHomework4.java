package homeWork;

import java.util.Scanner;

public class PatikaHomework4 {

	public static void main(String[] args) {
		/*Taksimetre Programı
		Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

		Taksimetre KM başına 2.20 TL tutmaktadır.
		Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
		Taksimetre açılış ücreti 10 TL'dir.
		perKm = ıngılızcede km başına anlamına geliyor
		 */
		
		int km;
		double perKm = 2.20;
		double total,startPrice = 10;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mesafeyi km cinsinden girin");
		km = scanner.nextInt();
		
		total = (km * perKm);
		total += startPrice;
		
		//20 tl den kucukse true değilse totalin kendı tuttugu degeri tut
		total =  (total < 20) ? 20 : total;
		System.out.println("Toplam Tutar : " +total);
	}

}


