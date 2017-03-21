package com.tiy;

/**
 * Created by josh on 3/21/17.
 */
public enum Rank {
	TWO(2,false),
	THREE(3,false),
	FOUR(4,false),
	FIVE(5,false),
	SIX(6,false),
	SEVEN(7,false),
	EIGHT(8,false),
	NINE(9,false),
	TEN(10,false),
	JACK(11,true),
	QUEEN(12,true),
	KING(13,true),
	ACE(14,true);


	private boolean faceCard;
	private int value;

	Rank( int value, boolean faceCard){
		this.faceCard = faceCard;
		this.value = value;
	}


	public  boolean isFaceCard() {
		return faceCard;
	}

	public int getValue(){
		return this.value;
	}
}
