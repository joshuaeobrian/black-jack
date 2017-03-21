package com.tiy;

import java.util.ArrayList;

/**
 * Created by josh on 3/21/17.
 */
public class Player {
	private ArrayList<Card> hand = new ArrayList<>();

	public void drawCard(Deck deck) {
		hand.add(deck.draw());

	}

	public int cardsInHand(){
		return hand.size();
	}

}
