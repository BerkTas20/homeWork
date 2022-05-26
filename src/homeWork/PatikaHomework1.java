package homeWork;

import java.util.Scanner;

public class PatikaHomework1 {

	public static void main(String[] args) {
int math,physics,chemistry,turkish,history,music;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Matematik notunu giriniz");
		math = scanner.nextInt();
		
		System.out.println("fizik notunu giriniz");
		physics = scanner.nextInt();
		
		System.out.println("kimya notunu giriniz");
		chemistry = scanner.nextInt();
		
		System.out.println("türkçe notunu giriniz");
		turkish = scanner.nextInt();
		
		System.out.println("tarih notunu giriniz");
		history = scanner.nextInt();
		
		System.out.println("müzik notunu giriniz");
		music = scanner.nextInt();
		
		double myResult = (math+physics+chemistry+turkish+history+music) / 6;
		System.out.println("Not ortalaması"+ myResult);
		String result = 60 < myResult ? "Geçtin:) " : "Kaldın:( ";	
		System.out.println(result);
		
	}

}