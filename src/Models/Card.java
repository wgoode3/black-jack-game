package Models;

public class Card {
	public String suit;
	public String value;
	public Integer cardValue;
	public Card(String suit, String value) {
		this.suit = suit;
		this.value = value;
		if(value == "King" || value == "Queen" || value == "Jack") {
			cardValue = 10;
		} else if(value == "Ace") {
			cardValue = 11;
		} else {
			cardValue = Integer.parseInt(value);
		}
	}
	public String toString() {
		return "The " + value + " of " + suit;
	}
}
