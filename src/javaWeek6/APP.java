package javaWeek6;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class APP {
		List<String> names = List.of("Sam", "Alex", "Amy", "Pat", "Ty");
		
		Random random = new Random();
		
		public static void main(String[] args) {
		new APP().run();

	}

		private void run() {
			List<String> theNames = new LinkedList<>(names);
			Player player1 = createPlayer(theNames);
			Player player2 = createPlayer(theNames);
			
			Deck deck = new Deck();
			System.out.println(deck);
		}

		private Player createPlayer(List<String> names) {
			int pos = random.nextInt(names.size());
			String name = names.remove(pos);
			return new Player(name);
		}

}
