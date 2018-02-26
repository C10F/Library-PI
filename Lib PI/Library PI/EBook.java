
public class EBook extends Inventory {
	//attributes
	private static int amountAway;
	
	
	//constructors
	
	
	//methods
	public static int getAmountAway() {
		return amountAway;
	}

	public static void setAmountAway(int away) {
		EBook.amountAway = away;
	}
}
