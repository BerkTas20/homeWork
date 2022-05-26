package homeWork;

import java.util.Scanner;

public class PatikaHomework5 {

	public static void main(String[] args) {
float height,weight,result;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen boyunuzu giriniz");
		height = scanner.nextFloat();
		
		System.out.println("Lütfen kilonuzu giriniz");
		weight = scanner.nextFloat();
		
		result = weight / (height * height);
		 System.out.println("Beden Kitle İndeksiniz = " + result);
		 
		 if(result < 18) {
			 System.out.println("Zayıf");
		 }
		 else if(result < 25) {
			 System.out.println("Normal");
		 }
		 else if(result < 30) {
			 System.out.println("Hafif şişman");
		 }
		 else if(result < 30) {
			 System.out.println("Sisman");
		 }
		 else {
	            System.out.println("Obez");
	        }
	}

}