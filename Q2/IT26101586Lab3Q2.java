import java.util.Scanner;

public class IT26101586Lab3Q2{

    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

        System.out.println("Enter the monthly salary");
		
		double salary = input.nextDouble();
		
		System.out.println("Enter the number of OT hours:");
		
		double OThours = input.nextDouble();
		
		System.out.println("Enter the OT hourly rate:");
		
		double OTrate = input.nextDouble();
		
		double OTAmount = OThours*OTrate;
		double TotalSalary = salary + OTAmount;
        
		System.out.println("The total salary including OT is:"+TotalSalary);
		

	}
	
	
	
}