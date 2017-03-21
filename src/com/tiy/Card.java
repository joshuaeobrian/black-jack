package com.tiy;

/**
 * Created by josh on 3/21/17.
 */
public class Card {

	private Rank rank;
	private Suit suit;
	private boolean faceUp;

	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
		this.faceUp = false;
	}

	public void flip(){
		this.faceUp = !this.faceUp;
	}



	public boolean isFaceUp() {
		return faceUp;
	}

	public boolean isFaceCard() {
		return rank.isFaceCard();
	}

	public Suit getSuit() {
		return suit;
	}

	public Rank getRank(){
		return this.rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}
}
