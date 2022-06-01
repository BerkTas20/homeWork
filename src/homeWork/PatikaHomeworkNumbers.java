package homeWork;

import java.util.Scanner;

public class PatikaHomeworkNumbers {

	public static void main(String[] args) {

		int x,y,z;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1.sayi: ");
		x = scanner.nextInt();
		
		System.out.println("2.sayi: ");
		y = scanner.nextInt();
		
		System.out.println("3.sayi: ");
		z = scanner.nextInt();
		
		if((x < y) && (x < z)){
			if(y < z) {
				System.out.println(x + "<" + y + "<" + z);
			}else
				System.out.println(x + "<" + z + "<" + y);
		}else if((y < x) && (y < z)) {
			if(x < z) {
				System.out.println(y + "<" + x + "<" + z);
			}
			else 
				System.out.println(y + "<" + y + "<" + x);
			}else {
				if(y < x) {
					System.out.println(z + "<" + y + "<" + x);
				}else 
					System.out.println(z + "<" + x+ "<" + y);
				}
			}
		}
	


