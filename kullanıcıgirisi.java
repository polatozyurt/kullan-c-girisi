import java.util.Scanner;

public class kullan�c�girisi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		//defining variables
		String userName, password;
		//taking inputs from the user

		System.out.print("Kullan�c� isminizi giriniz: ");
		userName=input.nextLine();
		

		System.out.print("�ifrenizi giriniz: ");
		password=input.nextLine();
		//matching the inputs with the true user name and passweord
		
		if(userName.equals("polatozyurt")&password.equals("polat123")) {
			System.out.println("Giri� yapt�n�z !");
		}
		else {	
			System.out.println("Tekrar Deneyiniz");
		}	
		
		
		
		
	}

}
