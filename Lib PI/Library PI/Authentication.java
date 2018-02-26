import java.util.ArrayList;
public class Authentication {
	//attributes
	private ArrayList<Integer> cards = new ArrayList<Integer>();
	
	//constructors
	
	//methods
	public void addCard(int cardId_) {
		cards.add(cardId_);
	}
	
	public ArrayList<Integer> getCards() {
		return cards;
	}
	public int getCard(int i)
	{
		return cards.get(i);
	}
}
