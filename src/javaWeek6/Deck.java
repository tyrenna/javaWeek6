package javaWeek6;
//Deck

import java.util.LinkedList;
import java.util.List;

public class Deck extends LinkedList<Card> {
	private final List<String> name = List.of("Clubs", "Diamonds", "Hearts", "Spades");
	
	private final List<String> number = List.of("2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace");

	public Deck() {
		for (int namePos = 0; namePos < name.size(); namePos++) {
			int number = namePos +1;
			String suit = name.get(namePos);
		
			}
	   }
	

	@Override
	public String toString() {
		StringBuilder b = new StringBuilder();
		
		b.append("List of cards").append(System.lineSeparator());
		
		for (Card card : this) {
		b.append("  ").append(card).append(System.lineSeparator());
		}
		return b.toString();
	}
}




		
		
		
		
		
		
		
		
		
		
		
		
