package homeWork;

import java.util.Scanner;

public class PatikaHomework7 {

	public static void main(String[] args) {
		//kullanıcı girişi
		
		String userName,password,newPassword;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("username : ");
		userName = scanner.nextLine();
		
		System.out.println("password: ");
		password = scanner.nextLine();
		
		
		if(userName.equals("patika") && password.equals("java123")) {
			System.out.println("Successfully login!");
		}else {
			System.out.println("False informations!");
			
			 System.out.println("Do you want to reset your password?" +
	                    "\n If you want '1' " +
	                    "\n If you dont want '2' choose.");		
		int choose = scanner.nextInt();
		scanner.nextLine();     // nextInt() kendinden sonra gelen nextLine() değer almasını engelliyor.
		
		
		switch(choose) {
		case 1:
			System.out.println("Please \r\n"+ "enter a new password");
			newPassword = scanner.nextLine();
					if(newPassword.equals("java123")) {
						System.out.println("Sorry bro , your new password looks like your old password!!");
					}
					else {
						System.out.println("Congratulations! password is  has been reset");
						System.out.println("Your name password" + newPassword);
					}
					break;
		case 2:
			System.out.println("You didn't want to reset your password");
			break;
		default:
            System.out.println("Please Choose '1' or '2'.");
			}
		}

	}

}
