package homeWork;

import java.util.Scanner;

public class PatikaHomework3 {

	public static void main(String[] args) {
		int a,b,c;
		int u;
		int alan;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.KENARI GİRİNİZ! ");
		a = scanner.nextInt();
		
		System.out.println("2.KENARI GİRİNİZ! ");
		b = scanner.nextInt();
		
		System.out.println("3.KENARI GİRİNİZ! ");
		c = scanner.nextInt();

		//sqrt = javada karekök almamızı sağlar
		
		u = (a+b+c) / 2;
		alan = (int)Math.sqrt(u * (u - a) * (u - b) * (u - c));
		System.out.println("ÜÇGENİN ALANI=" +alan);
	}

}