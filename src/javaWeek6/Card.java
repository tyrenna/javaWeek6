package javaWeek6;

public class Card {
	private String name;
	private int number;
	
	public Card(String name, int number) {
		this.number = number;
		this.name = name;
	

	}

	protected String getName() {
		return name;
	}

	protected int getNumber() {
		return number;
	}

	@Override
	public String toString() {

		return number + "of" + name;
	}



	
	
	}
	
	
	
	
	
	
	
	
	
	

