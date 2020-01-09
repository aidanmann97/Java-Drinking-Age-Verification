import java.util.*;

public class VerifyLegalDrinkingAge {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
			int age = -1;
		
			while (age < 0) {
				System.out.println("Please enter your age: ");
				
				String input = stdin.nextLine();
				
				try {
					age = Integer.valueOf(input);
				} catch (NumberFormatException e) {
					age = -1;
					
					System.out.println("Please enter an integer!");
				}
				if (age >= 0 && age < 21) {
					System.out.println("You are not old enough to drink!");
					} else if (age >= 21) {
						System.out.println("You are old enough to drink. Drink Responsibly!");
					}
				}
	
	}

}
