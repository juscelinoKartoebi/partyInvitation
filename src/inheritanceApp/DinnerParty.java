package inheritanceApp;

public class DinnerParty extends Party {
	private int dinnerChoice;

	public int getDinnerChoice() {
		return dinnerChoice;
	}

	public void setDinnerChoice(int choice) {
		this.dinnerChoice = choice;
	}

	public void displayDinnerChoice() {
		System.out.println("Menu of this party is: ");
		if (dinnerChoice == 1) {
			System.out.println("bbq chicken and fries.");
		} else if (dinnerChoice == 2) {
			System.out.println("bbq steak and mashed potatos.");
		} else
			System.out.println("No food");
	}

}
