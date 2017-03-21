package com.tiy;

import java.util.HashMap;
import java.util.Random;

/**
 * Created by josh on 3/21/17.
 */
public class Deck {

	private HashMap<String,Integer> deck = new HashMap<>();

	public Deck() {

		for (Rank rank : Rank.values()) {
			deck.put(rank.toString(),4);

		}

	}

	public Card draw() {
		Random random = new Random();
		int rankRandom = random.nextInt(13);
		int suitRandom = random.nextInt(4);
		String rank = Rank.values()[rankRandom].toString();
		deck.put(rank, deck.get(rank) -1);

		Card card = new Card(Rank.values()[rankRandom], Suit.values()[suitRandom]);
		System.out.println(deck.get(rank));
		 return card;

	}
}
