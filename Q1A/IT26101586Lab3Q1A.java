import java.util.Scanner;

public class IT26101586Lab3Q1A{

    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

        System.out.println("Enter the price of 1kg of rice: ");
		
        double pricePerKg = input.nextDouble();

		System.out.println("Enter the number of kilograms you want to buy:");
		
		double kilograms = input.nextDouble();

		double amountopay = pricePerKg*kilograms;
		
		System.out.println("The Total amount is : " +amountopay);
		


	}
	
	
	
}