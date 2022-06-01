package homeWork;

import java.util.Scanner;

public class CinZodyak {

	public static void main(String[] args) {
		int dogumYili,mod;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Dogum yilini gir: ");
		dogumYili = scanner.nextInt();
		mod = dogumYili % 12;
		
		switch(mod) {
		case 0:
			System.out.println("Burcunuz: Maymun");
			break;
		case 1:
			System.out.println("Burcunuz: Horoz");
			break;
		case 2:
			System.out.println("Burcunuz: Kopek");
			break;
		case 3:
			System.out.println("Burcunuz: Domuz");
			break;
		case 4:
			System.out.println("Burcunuz: Fare");
			break;
		case 5:
			System.out.println("Burcunuz: Okuz");
			break;
		case 6:
			System.out.println("Burcunuz: Kaplan");
			break;
		case 7:
			System.out.println("Burcunuz: Tavsan");
			break;
		case 8:
			System.out.println("Burcunuz: Ejderha");
			break;
		case 9:
			System.out.println("Burcunuz: Yilan");
			break;
		case 10:
			System.out.println("Burcunuz: At");
			break;
		case 11:
			System.out.println("Burcunuz: Koyun");
			break;
		}
	}

}
