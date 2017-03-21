package com.tiy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

/**
 * Created by josh on 3/21/17.
 */
public class PlayTest {


	@Test
	/**
	 *
	 *
	 */
	public void doesPlayReturnCorrectCard() throws Exception{
		Card card1 = new Card(Rank.EIGHT, Suit.CLUBS);
		Card card2 = new Card(Rank.ACE, Suit.HEARTS);
		Play play = new Play();
		play.battle(card1,card2);


		assertThat(play.getWinningCard(), equalTo(card2));

	}

	@Test
	/**
	 *
	 */
	public void compareTwoOfTheSame(){
		Card card1 = new Card(Rank.ACE, Suit.CLUBS);
		Card card2 = new Card(Rank.ACE, Suit.HEARTS);
		Play play = new Play();

		play.battle(card1,card2);


		assertThat(play.getWinningCard(),anyOf(equalTo(card1),equalTo(card2)));

	}
}
