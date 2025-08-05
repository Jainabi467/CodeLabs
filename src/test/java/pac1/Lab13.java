package pac1;

import java.time.LocalDate;
import java.util.Scanner;
public class Lab13 {
	
	    public static void printWarrantyExpiryDate(LocalDate purchaseDate, int years, int months) {
	        LocalDate expiryDate = purchaseDate.plusYears(years).plusMonths(months);
	        System.out.println("Warranty expires on: " + expiryDate);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter purchase date (yyyy-mm-dd): ");
	        LocalDate purchaseDate = LocalDate.parse(sc.nextLine());
	        System.out.print("Enter warranty period in years: ");
	        int years = sc.nextInt();

	        System.out.print("Enter warranty period in months: ");
	        int months = sc.nextInt();

	        printWarrantyExpiryDate(purchaseDate, years, months);
	    }

}
