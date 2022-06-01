package homeWork;

import java.util.Scanner;

public class PatikaHomework12 {

	public static void main(String[] args) {
		int mesafe,yas,yolculukTipi;
		double normalTutar = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Mesafeyi girin(Km): ");
		mesafe = scanner.nextInt();
		
		System.out.println("Yasinizi girin: ");
		yas = scanner.nextInt();
		
		System.out.println("Hoşgeldiniz! Yolculuk tipini girin\n1-Tek yon\n2-Gidis\n3-Donus):");
		yolculukTipi = scanner.nextInt();
		
		if(mesafe > 0) {
			normalTutar = mesafe * 0.1;
		}
		else {
			System.out.println("Hatalı değer girdiniz!");
		}
		if(yas > 0 && yas <12){
			normalTutar -= (normalTutar * 0.5); 
		}
		if(yas >= 12 && yas <= 24) {
			normalTutar -= (normalTutar * 0.1);
		}
		if(yas > 65) {
			normalTutar -= (normalTutar * 0.3);
		}
			
		if((yolculukTipi == 1) || (yolculukTipi == 2)) {
			if(yolculukTipi == 2) {
				normalTutar -= (normalTutar * 0.2);
				normalTutar *= 2;
			}
		}
		else {
			System.out.println("Hata! yolculuk tipi için 1 veya 2 numaralarını giriniz!!!!!!!!!! ");
		}
		System.out.println("Toplam tutar = " + normalTutar + "TL"); 
	}

}
