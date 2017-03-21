package com.tiy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by josh on 3/21/17.
 */
public class SuitTest {

	@Test
	/**
	 * Test to make sure clubs are black
	 */
	public void checkThatColorIsCorrect() throws Exception {
		assertThat(Suit.CLUBS.getSuiteColor(), equalTo("Black"));
	}

	@Test
	/**
	 * Test to make sure clubs are black
	 */
	public void checkSuiteNameValue() throws Exception {
		assertThat(Suit.CLUBS.getSuitName(), equalTo("Club"));
	}

}

