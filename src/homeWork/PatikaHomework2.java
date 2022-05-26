package homeWork;

import java.util.Scanner;

public class PatikaHomework2 {

	public static void main(String[] args) {
		double tutar,kdvOran,kdvTutar,kdvliTutar;
		boolean kdvDurum;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tutarı gir");
		tutar = scanner.nextDouble();
		
		kdvDurum = (0 < tutar) && (tutar<1000);
		kdvOran = kdvDurum ? 0.18d:0.08d;
		System.out.println("Tutar" + kdvOran +"kdv oranı");
		kdvTutar = tutar * kdvOran;
		kdvliTutar = kdvTutar + tutar;
		
		System.out.println("Kdv'siz tutar: " + tutar);	
		System.out.println("Kdv oranı: " + kdvOran);
		System.out.println("Kdv  tutar: " + kdvTutar);
		System.out.println("Kdv'li tutar: " + kdvliTutar);


	}

}
