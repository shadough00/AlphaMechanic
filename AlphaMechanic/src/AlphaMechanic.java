import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class AlphaMechanic {

	private static DecimalFormat df = new DecimalFormat("0.00");
	
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
		System.out.println("*****Parts*****");
		System.out.print("Parts Description: \t");
		String part_description = keyboard.nextLine();
		System.out.print("Total Price: \t\t");
		String part_price = keyboard.nextLine();
		
		//new page
				for (int x = 0; x < 2; x++) {
					System.out.println(" ");
				}
				
		//labor
		System.out.println("*****Labor*****");
		System.out.print("Labor Describtion: \t");
		String labor_description = keyboard.nextLine();
		System.out.print("Total price: \t\t");
		String labor_price = keyboard.nextLine();
		
		//new page
		for (int x = 0; x < 2; x++) {
			System.out.println(" ");
		}
		
		//convert string prices to double
		double part_price1 = Double.valueOf(part_price);
		double labor_price1 = Double.valueOf(labor_price);
		
		//adjusting tax format
		double tax = Double.valueOf(tax_percent);
		tax = tax * 0.01;
		
		//Calculations
		double sub_total;
		double tax_total;
		double total_price;
		sub_total = part_price1 + labor_price1;
		tax_total = sub_total * tax;
			//rounding tax
			String tax_final = df.format(tax_total);
			double tax_final1 = Double.valueOf(tax_final);
		total_price = sub_total + tax_final1;
		
		//new page
				for (int x = 0; x < 2; x++) {
					System.out.println(" ");
				}
		
		//printing receipt
		System.out.println("Printing Receipt.........");
		
		//new page
				for (int x = 0; x < 2; x++) {
					System.out.println(" ");
				}
		
		//print final product
		System.out.println(shop_name);
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("     " + shop_address + " " + shop_city + ", " + shop_state + " " + shop_zipcode);
		System.out.println("     " + "Phone: " + shop_number);
		System.out.println("     " + "Email: " + shop_email);
		System.out.println("     " + "Date Written: " + receipt_date);
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("     " + "Customer: " + customer_first_name + " " + customer_last_name);
		System.out.println("     " + "Cell: " + customer_cell_number);
		System.out.println("     " + "Email: " + customer_email);
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("     " + "Vehicle: " + car_year + " " + car_make + " " + car_model);
		System.out.println("     " + "License Plate: " + license_plate);
		System.out.println("     " + "VIN: " + vin_number);
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("     " + "*Description of Parts*");
		System.out.println("     " + part_description);
		System.out.println("     " + "Total Price of Parts: " + "$" + part_price);
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("     " + "*Labor Description*");
		System.out.println("     " + labor_description);
		System.out.println("     " + "Total Price of Labor: " + "$" + labor_price);
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("     " + "Parts Amount: \t" + "$" + part_price);
		System.out.println("     " + "Labor Amount: \t" + "$" + labor_price);
		System.out.println("     " + "Sub Total: \t" + "$" + sub_total);
		System.out.println("     " + "Total Tax: \t" + "$" + tax_final1);
		System.out.println("     " + "TOTAL: \t\t" + "$" + total_price);
		
		
		
		
		
		
		
		
		
		

	}

}
