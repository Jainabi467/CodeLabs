package pac1;


	import java.time.LocalDate;
	import java.time.Period;
	import java.util.Scanner;
	public class Lab11 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        
	        System.out.print("Enter a date (yyyy-mm-dd): ");
	        String input = sc.nextLine();

	      
	        LocalDate inputDate = LocalDate.parse(input);
	        LocalDate today = LocalDate.now();
	        Period diff = Period.between(inputDate, today);

	        
	        System.out.println("Difference is:");
	        System.out.println("Years: " + diff.getYears());
	        System.out.println("Months: " + diff.getMonths());
	        System.out.println("Days: " + diff.getDays());

	        sc.close();
	    }
	}


