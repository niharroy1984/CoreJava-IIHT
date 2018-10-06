package com.java.core.basics.threads.communication;

public class RedGuy implements Runnable{

	Dice dice;
	
	public RedGuy(Dice dice) {
		this.dice= dice;
	}
	
	@Override
	public void run() {
		
		while(true) {
			

			// TODO Auto-generated method stub
			
			System.out.println("Red guy is waiting for lock on dice");
			synchronized (dice) {
				System.out.println("Red guy is got  lock on dice");

				
				while(!dice.isYellowChance) {
					// do and notify
					System.out.println("Red gonna move");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Red played");
					dice.isYellowChance=true;
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
