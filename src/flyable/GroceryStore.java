package flyable;

public class GroceryStore implements Store{

	@Override
	public void sellItem() {
		System.out.println("Selling fruits");
	}

	@Override
	public void displayItem() {
		System.out.println("Displaying candies");
	}

	
}
