package com.java.core.basics.threads.communication;

public class YellowGuy implements Runnable{

	Dice dice;
	public YellowGuy(Dice dice) {
		this.dice=dice;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		

		while(true) {
			
			System.out.println("Yellow guy is waiting for lock on dice");
			synchronized (dice) {
				System.out.println("Yellow guy is got  lock on dice");

				
				while(dice.isYellowChance) {
					// do and notify
					System.out.println("yellow gonna move");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("yellow played");
					dice.isYellowChance=false;
					dice.notify();
				}
				
				
				try {
					dice.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
	}

}
