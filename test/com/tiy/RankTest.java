package com.tiy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by josh on 3/21/17.
 */
public class RankTest {


	@Test
	/**
	 * Test to make make sure the value of Ace is 14
	 */
	public void checkThatRankValueIsCorrect() throws Exception {
		assertThat(Rank.ACE.getValue(), equalTo(14));
	}

	@Test
	/**
	 * Test to make sure that Ace is a face card
	 */
	public void checkIfRankIsFaceCard() throws Exception {
		assertThat(Rank.ACE.isFaceCard(), equalTo(true));
	}


}
