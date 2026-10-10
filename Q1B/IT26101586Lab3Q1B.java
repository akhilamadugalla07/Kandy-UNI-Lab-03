import java.util.Scanner;

public class IT26101586Lab3Q1B{

    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

        System.out.println("Enter the price of 1kg of rice: ");
		
        double pricePerKg = input.nextDouble();

		System.out.println("Enter the number of kilograms you want to buy:");
		
		double kilograms = input.nextDouble();

		double amountopay = pricePerKg*kilograms;
		
		double discount = amountopay*10/100;
		
		double afterdiscount = amountopay - discount;
		
		System.out.println("The Total amount with 10% discount is : " +afterdiscount);
		 

	}
	
	
	
}