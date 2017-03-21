package com.tiy;

/**
 * Created by josh on 3/21/17.
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Black Jack");
		Player player = new Player();
		Deck deck = new Deck();

		player.drawCard(deck);
		player.drawCard(deck);

		Player player2 = new Player();


	}



}
