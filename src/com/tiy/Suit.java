package com.tiy;

/**
 * Created by josh on 3/21/17.
 */
public enum Suit {
	SPADES("Spade","Black"),
	HEARTS("Heart","Red"),
	CLUBS("Club","Black"),
	DIAMONDS("Diamond","Red");


	private  String suiteName;
	private  String suiteColor;


	Suit(String suite, String color){
		this.suiteName = suite;
		this.suiteColor = color;
	}

	public String getSuitName() {
		return suiteName;
	}


	public String getSuiteColor() {
		return suiteColor;
	}
}
