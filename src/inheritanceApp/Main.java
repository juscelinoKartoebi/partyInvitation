package inheritanceApp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int guests;
		int choice;
		Party aParty = new Party();
		DinnerParty dParty = new DinnerParty();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of guests for the party: ");
		guests = scanner.nextInt();
		
		dParty.setGuests(guests);
		System.out.println("Enter the menu option: 1 for chicken or 2 for beef: ");
		
	
		choice = scanner.nextInt();
		System.out.println("The party has " + dParty.getGuests() + " guests " + "\n");
		
		dParty.displayDinnerChoice();
		if (choice == 1) {
			System.out.println("bbq chicken and fries.");
		} else
			System.out.println("bbq steak and mashed potatos.");
		System.out.println();
		aParty.displayInvitation();
	}
}
