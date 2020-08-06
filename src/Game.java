import java.util.ArrayList;
import java.util.Scanner;

import Models.Card;
import Models.Deck;

public class Game {
	
	public static Scanner in = new Scanner(System.in);
	
	public static Integer getHandValue(ArrayList<Card> hand) {
		Integer total = 0;
		for(Card c: hand) {
			total += c.cardValue;
		}
		return total;
	}
	
	public static void main(String[] args) {
		Integer handValue = 0;
		Boolean done = false;
		ArrayList<Card> hand = new ArrayList<Card> ();
		Deck d1 = new Deck();
		d1.shuffle();
		hand.add(d1.deal());
		hand.add(d1.deal());
		System.out.println(hand);
		handValue = getHandValue(hand);
		while(handValue < 21) {
			System.out.println("Your current hand:");
			System.out.println(hand);
			System.out.println("Would you like another card? y/n");
			String answer = in.nextLine();
			if(answer.equals("y") || answer.equals("Y")) {
				hand.add(d1.deal());
				handValue = getHandValue(hand);
			} else {
				break;
			}
		}
		System.out.println(hand);
		System.out.println(handValue);
	}
}
