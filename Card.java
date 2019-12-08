package War;

public class Card {

	private String name;
	public int value;
	public String suit;

	public Card(int value, String suit) {
		if (value < 15) {
			name = value + " of " + suit;
		}else if (value == 11) {
			name = "Jack of " + suit;
		}else if (value == 12) {
			name = "Queen Of " + suit;
		}else if (value == 13) {
			name = "King Of " + suit;
		}else if (value == 14) {
			name = "Ace Of " + suit;
		}
		
	}
	
	
	public String describe() {
		return name;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	
}
