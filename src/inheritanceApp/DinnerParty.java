package inheritanceApp;

public class DinnerParty extends Party {
	private int dinnerChoice;

	public int getDinnerChoice() {
		return dinnerChoice;
	}
	public void setDinnerChoice(int choice) {
		dinnerChoice = choice;
	}
	public void displayDinnerChoice() {
		System.out.println("Menu of this party is: ");
	}
}
