package Models;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	public ArrayList<Card> deck = new ArrayList<Card>();
	
	public Deck() {
		String[] suits = new String[] {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] values = new String[] {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		for(String suit: suits) {
			for(String value: values) {
				deck.add(
					new Card(suit, value)
				);
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	public Card deal() {
		Card dealtCard = deck.get(0);
		deck.remove(0);
		return dealtCard;
	}

}
