package War;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> cards = new ArrayList<Card>();
	public static String[] suits = new String[] {"Hearts", "Clubs", "Spades", "Diamonds"};
	
		
		public Deck() {
 
			for (String suit : suits) {
				for(int i = 2; i < 15 ; i++) {
					
					cards.add(new Card(i, suit));
				}
			}
			
}
	public void shuffle() {
		Collections.shuffle(cards);
		
	}
	
	public Card draw() {
		return cards.remove(0);
	}
}
	
