import java.util.Scanner;

public class kullanýcýgirisi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		//defining variables
		String userName, password;
		//taking inputs from the user

		System.out.print("Kullanýcý isminizi giriniz: ");
		userName=input.nextLine();
		

		System.out.print("Þifrenizi giriniz: ");
		password=input.nextLine();
		//matching the inputs with the true user name and passweord
		
		if(userName.equals("polatozyurt")&password.equals("polat123")) {
			System.out.println("Giriþ yaptýnýz !");
		}
		else {	
			System.out.println("Tekrar Deneyiniz");
		}	
		
		
		
		
	}

}
