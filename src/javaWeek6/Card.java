package javaWeek6;

public class Card {
	private String name;
	private int value;
	
	public Card(String name, int value) {
		this.value = value;
		this.name = name;
	

	}

	protected String getName() {
		return name;
	}

	protected int getNumber() {
		return value;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {

		return value + "of" + name;
	}



	
	
	}
	
	
	
	
	
	
	
	
	
	

