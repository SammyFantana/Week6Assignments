package War;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;
	
	public Player(String name) {
		this.name = name;
		score = 0;
		
	}
	
	public String descibe() {
		System.out.println(name + "has the following cards:\n");
		for(Card card : hand) {
			return card.describe();
		}
		return name;	
	}

	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public Card flip() {
		return hand.remove(0);
	}
	
	public void incremment() {
		score++;
	}
	
}
