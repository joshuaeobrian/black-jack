package com.tiy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

/**
 * Created by josh on 3/21/17.
 */
public class CardTest {


	@Test
	/**
	 * Given a card
	 * When initialized using the constructor
	 * Then the card object is not null
	 */
	public void canCreateCard() throws Exception {
		Card card = new Card(Rank.KING, Suit.SPADES);
		assertThat(card, notNullValue());
	}

	@Test
	/**
	 * Given a face down card
	 * When flip method is called
	 * Then returns true
	 */
	public void checkIsFaceUp() throws Exception {
		Card card = new Card(Rank.KING, Suit.SPADES);
		card.flip();
		assertThat(card.isFaceUp(), equalTo(true));
	}

	@Test
	/**
	 * Given a card
	 * When when card is initialized face down
	 * Then returns false
	 */
	public void checkIsFaceDown() throws Exception {
		Card card = new Card(Rank.KING, Suit.SPADES);
		assertThat(card.isFaceUp(), equalTo(false));
	}


	@Test
	/**
	 * Given a card
	 * When a card is a face card
	 * Then return true
	 */
	public void checkIsFaceCard() throws Exception {
		Card card = new Card(Rank.KING, Suit.SPADES);
		assertThat(card.isFaceCard(), equalTo(true));
	}

	@Test
	/**
	 *Give a card
	 *When card is a Spade
	 *Then return true
	 */
	public void checkSuiteType() throws Exception {
		Card card = new Card(Rank.KING, Suit.SPADES);
		assertThat(card.getSuit(), equalTo(Suit.SPADES));

	}




}
