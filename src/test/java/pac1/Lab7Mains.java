package pac1;


	import java.util.Scanner;

	public class Lab7Mains {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			Lab7 p1 = new Lab7();  // updated class name

			p1.setFisrtName("Shaik");
			p1.setLastName("Jainabi");

			System.out.println("Person Details");
			System.out.println("-----------------");

			System.out.println("FirstName: " + p1.getFisrtName());
			System.out.println("LastName: " + p1.getLastName());
			System.out.println("Gender: " + p1.getGender());

			System.out.println("Enter mobile number:");
			String acceptedNumber = sc.next();
			System.out.println("Phone number: " + acceptedNumber);

		}
	}

