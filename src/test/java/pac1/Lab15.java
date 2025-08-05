package pac1;


import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab15 {
	
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static int calculateAge(LocalDate dob) {
        LocalDate today = LocalDate.now();
        return Period.between(dob, today).getYears();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter Date of Birth (yyyy-mm-dd): ");
        LocalDate dob = LocalDate.parse(sc.nextLine());
        System.out.println("Enter weight");
        int weight=sc.nextInt();
        
        String fullName = getFullName(firstName, lastName);
        int age = calculateAge(dob);

        
        // Display results
        System.out.println("\n--- Person Details ---");
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("weight :" + weight);

    }
}



