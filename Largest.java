// This program inputs 10 integers and returns the largest integer.
import java.util.Scanner;
public class Largest {

	public static void main(String[] args) {
		
		// Create instance of Scanner object
		Scanner input = new Scanner(System.in);
		
		
		// Instance variables
		int counter = 1;
		int number = 0;
		int largest = 0;
		
		// While loop to find largest integer
		while (counter <= 10) {
			System.out.println("Enter a number: ");
			number = input.nextInt();
			if (number > largest) {
				largest = number; }
			counter++; }
		System.out.println("The largest integer is: " + largest);
		}
	}