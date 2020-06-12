import java.util.Scanner;
public class AlphaMechanic {

	public static void main(String[] args) {
		//objects
		Scanner keyboard = new Scanner(System.in);

		//Introduction
		System.out.println("Welcome to Alpha-Mechanic!");
		System.out.println("(Put N/A if you do not know)");

		//new page
		for (int x = 0; x < 2; x++) {
			System.out.println(" ");
		}

		//Mechanic Informationn
		System.out.println("*****Mechanic Information*****");
		System.out.print("Mechanic Shop Name:\t");
		String shop_name = keyboard.nextLine();
		System.out.print("Street Address:\t\t");
		String shop_address = keyboard.nextLine();
		System.out.print("City:\t\t\t");
		String shop_city = keyboard.nextLine();
		System.out.print("State:\t\t\t");
		String shop_state = keyboard.nextLine();
		System.out.print("Zipcode:\t\t");
		String shop_zipcode = keyboard.nextLine();
		System.out.print("Email:\t\t\t");
		String shop_email = keyboard.nextLine();
		System.out.print("Phone Number:\t\t");
		String shop_number = keyboard.nextLine();

		//new page
		for (int x = 0; x < 2; x++) {
			System.out.println(" ");
		}

		//Other information
		System.out.println("*****Other Information*****");
		System.out.print("Date:\t\t\t\t");
		String receipt_date = keyboard.nextLine();
		System.out.print("Tax in Percent (ex. 7) :\t");
		int tax_percent = keyboard.nextInt();
		keyboard.nextLine();

		//new page
		for (int x = 0; x < 2; x++) {
			System.out.println(" ");
		}

		//Customer Information
		System.out.println("*****Customer Information*****");
		System.out.print("Enter First Name:\t");
		String customer_first_name = keyboard.nextLine();
		System.out.print("Enter Last Name:\t");
		String customer_last_name = keyboard.nextLine();
		System.out.print("Enter Cell Number:\t");
		String customer_cell_number = keyboard.nextLine();
		System.out.print("Enter Email:\t\t");
		String customer_email = keyboard.nextLine();


		//new page
		for (int x = 0; x < 2; x++) {
			System.out.println(" ");
		}

		//Adding car
		System.out.println("*****Car Information*****");
		System.out.print("VIN Number:\t");
		String vin_number = keyboard.nextLine();
		System.out.print("Year:\t\t");
		String car_year = keyboard.nextLine();
		System.out.print("Car Make:\t");
		String car_make = keyboard.nextLine();
		System.out.print("Car Model:\t");
		String car_model = keyboard.nextLine();
		System.out.print("License Plate:\t");
		String license_plate = keyboard.nextLine();

		//new page
		for (int x = 0; x < 2; x++) {
			System.out.println(" ");
		}

		//parts repair
		int number_parts = 0;
		System.out.println("*****Parts*****");
		System.out.print("How many parts were replaced:\t");
		number_parts = keyboard.nextInt();
		//number_parts--;
		int[] parts = new int [number_parts];
		int q = 1;
		for (int y = 0; y < number_parts; y++) {
			System.out.print("Enter the part "+ q  + " cost:\t\t");
			parts[y] = keyboard.nextInt();
			q++;
		}

		//new page
		for (int x = 0; x < 2; x++) {
			System.out.println(" ");
		}
		keyboard.nextLine();
		
		//labor
		System.out.println("*****Labor*****");
		//for (int p = 0; )
		
		
		
		
		
		
		
		
		
		

	}

}
