
import java.util.Scanner;

public class IT26101586Lab3Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int NUM = input.nextInt();
		
		int d1 = NUM / 10000;
        int d2 = (NUM / 1000) % 10;
        int d3 = (NUM / 100) % 10;
        int d4 = (NUM / 10) % 10;
        int d5 = NUM % 10;

        System.out.println(d1 + " " + d2 + " " + d3 + " " + d4 + " " + d5);

        input.close();
		
    }
}
