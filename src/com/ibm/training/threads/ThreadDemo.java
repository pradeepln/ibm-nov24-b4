package com.ibm.training.threads;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		//byExtendingThread();
		byImplementingRunnable();
	}

	private static void byImplementingRunnable() throws InterruptedException {
		long startTime = System.currentTimeMillis();
		System.out.println("In ThreadDemo Class Runnable "+Thread.currentThread().getName());
		
		PrimeCounterTask task1 = new PrimeCounterTask(1, 140_000);
		PrimeCounterTask task2 = new PrimeCounterTask(140_001, 200_000);
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
				
		t1.join();
		t2.join();
		
		System.out.println("Total primes: " + (task1.getCount() + task2.getCount()));
		
		long stopTime = System.currentTimeMillis();
		System.out.println("Took "+ (stopTime - startTime)+" ms.");
	}

	private static void byExtendingThread() throws InterruptedException {
		long startTime = System.currentTimeMillis();
		System.out.println("In ThreadDemo Class "+Thread.currentThread().getName());
		
		PrimeCounterThread t1 = new PrimeCounterThread(1, 140_000);
		PrimeCounterThread t2 = new PrimeCounterThread(140_001, 200_000);
		t1.start();
		t2.start();
		
		/*
		 * while(t1.isAlive()) { Thread.sleep(500); }
		 */
		t1.join();
		t2.join();
		
		System.out.println("Total primes: " + (t1.getCount() + t2.getCount()));
		
		long stopTime = System.currentTimeMillis();
		System.out.println("Took "+ (stopTime - startTime)+" ms.");
	}

}
