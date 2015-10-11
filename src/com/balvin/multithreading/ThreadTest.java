package com.balvin.multithreading;

public class ThreadTest {
	public static void main(String[] args) {
		DispThread dispThread = new DispThread("Hello");
		DispThread dispThread2 = new DispThread("World");
		
		Thread thread = new Thread(dispThread);
		Thread thread2 = new Thread(dispThread2);
		
		thread.start();
		thread2.start();
		
		
	}
}
