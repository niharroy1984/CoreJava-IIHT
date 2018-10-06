package com.java.core.basics.threads.communication;

public class LudoPlayer {
public static void main(String[] args) {
	Dice dice = new Dice();
	
	Thread yellowPlayer = new Thread(new YellowGuy(dice));
	Thread redPlayer = new Thread(new RedGuy(dice));
	yellowPlayer.start();
	redPlayer.start();
	
}
}
