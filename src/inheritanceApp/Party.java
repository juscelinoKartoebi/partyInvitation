package inheritanceApp;

public class Party {
	private int guests;

	public int getGuests() {
		return guests;
	}
	public void setGuests(int numGuests) {
		guests = numGuests;
	}
	public void displayInvitation() {
		System.out.println("You are invited for my birthday party!");
		
	}

}
