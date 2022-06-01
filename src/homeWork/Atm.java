package homeWork;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		 
		
		String islemSecenekleri = "--Bakiye goruntuleme--> 1 "
				+ "Para cekmek --> 2"
				+ "Farkli hesaba para yatirmak --> 3"
				+ "Cikis icin --> q tusuna basiniz";
		
		Scanner scanner = new Scanner(System.in);
		double berkBakiye = 3000;
		String berkIBAN = "TR1000 0000 000 000 000 0000 00 00 ";
		String berkKullanici = "berk123";
		String berkSifre = "123";
		
		double anilBakiye = 5000;
		String anilIBAN = "TR2222 2222 222 222 222 2222 22 22 ";
		String anilKullanici = "anil123";
		String anilSifre = "456";
		
		
		System.out.println("ATM ye Hosgeldiniz!");
		System.out.println("Lütfen bilgilerinizi giriniz: ");
		
		System.out.print("Kullanici adi: ");
		String kullaniciAdi = scanner.nextLine();
		
		System.out.print("Sifre: ");
		String sifre = scanner.nextLine();
		
		if(kullaniciAdi.equals("berk123") && sifre.equals("123"))
		{
			System.out.println("Berk Taş hesabina giris yapildi");
			System.out.println(islemSecenekleri);
			
			System.out.println("Lutfen bir secim yapiniz");
			String secim = scanner.nextLine();
			
			
			switch(secim) 
			{
				case"1":
					System.out.println("Bakiyeniz: " + berkBakiye);
					break;
					
				case"2":
					System.out.println("Cekmek istediginiz tutari giriniz: ");
					int cekilecekTutar = scanner.nextInt();
					
					if(berkBakiye >= cekilecekTutar)
					{
						berkBakiye -= cekilecekTutar;
						System.out.println("Kalan tutar: " + berkBakiye);						
					}else {
						System.out.println("Bakiyenizden fazla para cekemezsiniz...");
					}
					break;
					
				case"3":
					System.out.print("Ne kadar yatirmak istiyorsunuz: ");
					int yatirilacakTutar = scanner.nextInt();
					
					if(yatirilacakTutar <= berkBakiye)
					{
						System.out.print("İban giriniz: ");
						scanner.nextLine();
						String yatirilacakIBAN = scanner.nextLine();
						 
						if(yatirilacakIBAN.equals(anilIBAN)) 
						{
							System.out.println("Para, Anıl Tas adlı kisiye yatiriliyor");
							berkBakiye -= yatirilacakTutar;
							anilBakiye += yatirilacakTutar;
							
							System.out.println("Bakiyeniz: " + berkBakiye);
							System.out.println("Anilin Bakiye: " + anilBakiye);
						}
					}
					break;
			}
		}
		else if(kullaniciAdi.equals("anil123") && sifre.equals("456")) {
			System.out.println("Anıl Tas hesabina giris yapildi");
			System.out.println(islemSecenekleri);
		}
		else {
			System.out.println("Kullanici adiniz ve sifreniz yanlis");
		}

	}

}
