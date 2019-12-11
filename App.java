package War;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Player player1 = new Player("Player 1 ");
		Player player2 = new Player("Player 2 ");
		deck.shuffle();
		
		for(int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
			
		}	
		for (int g = 0; g < 26; g++) {
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			if (player1Card.getValue() > player2Card.getValue()) {
				player1.incremment();
			} else {
				player2.incremment();
			}
		}
		if (player1.score > player2.score) {
			System.out.println("Player 1 Wins!!");
		} else if (player1.score < player2.score) {
			System.out.println("Player 2 Wins!!");
		} else {
			System.out.println("DRAW!!!!");
		}
		
		System.out.println("Player 1 Score: " + player1.score);
		System.out.println("Player 2 Score: " + player2.score);
		
		}
	}



