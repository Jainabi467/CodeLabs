package pac1;
import java.util.Scanner;
public class Lab6Main {
	 
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			Lab6 p = new Lab6("Shaik","Jainabi",'F');
			System.out.println("Person Details");
			System.out.println("-----------------");
			System.out.println("FirstName: " + p.getFisrtName());
			System.out.println("LastName: " + p.getLastName());
			System.out.println("Gender: " + p.getGender());

			}
	}

