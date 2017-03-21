package com.tiy;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
/**
 * Created by josh on 3/21/17.
 */
public class PlayerTest {

	@Test
	public void checkToDrawCard() throws Exception{
		Deck deck = new Deck();
		Player player = new Player();
		player.drawCard(deck);
		assertThat(player.cardsInHand(),equalTo(1));

	}
}
