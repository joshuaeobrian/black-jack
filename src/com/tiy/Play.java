package com.tiy;

import java.util.Random;

/**
 * Created by josh on 3/21/17.
 */
public class Play {
	private Card winner;

	public void battle(Card card1, Card card2) {
		if(card1.getRank().getValue() > card2.getRank().getValue()){
			setWinningCard(card1);
			System.out.println("Card1 - " + card1.getRank().toString());
			printFinish(String.format("%n%s Won%nCard1: %s%nCard2: %s ","Card1",card1.getRank().toString(), card2.getRank().toString()));

		}else if (card1.getRank().getValue() < card2.getRank().getValue()){
			setWinningCard(card2);
			printFinish(String.format("%n%s Won%nCard1: %s%nCard2: %s ","Card2",card1.getRank().toString(), card2.getRank().toString()));
		}else {
			System.out.println("\nTIE-Calling new cards\n");
			getCards(card1,card2);
		}
	}
	private void printFinish(String print){
		System.out.println(print);
	}

	public Card getWinningCard(){
		return winner;
	}

	private void setWinningCard(Card winner){

		this.winner = winner;
	}


	private void getCards(Card card1, Card card2){
		Random random = new Random();
		System.out.println("Getting new cards");
		int rankRandom = random.nextInt(13);
		int suitRandom = random.nextInt(4);

		int rankRandom1 = random.nextInt(13);
		int suitRandom1 = random.nextInt(4);

		card1.setRank(Rank.values()[rankRandom]);
		card1.setSuit(Suit.values()[suitRandom]);
		card2.setRank(Rank.values()[rankRandom1]);
		card2.setSuit(Suit.values()[suitRandom1]);
		battle(card1,card2);

	}
}
