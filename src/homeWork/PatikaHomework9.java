package homeWork;

import java.util.Scanner;

public class PatikaHomework9 {

	public static void main(String[] args) {


		int heat;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sicaklik giriniz :");
		heat = scanner.nextInt();
		
		if(heat < 5) {
			System.out.println("Kayak yapabilirsiniz");
		}else if(heat >= 5 && heat <= 25) {
			if(heat <= 15) {
			System.out.println("Sinemaya gidebilirsin");
			}
		if(heat >= 10) {
			System.out.println("Piknige gidebilirsin");
		}
	}else {
		System.out.println("Yuzmeye gidebilirsiniz");
	}
		}
		
}
