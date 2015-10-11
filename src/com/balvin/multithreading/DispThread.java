package com.balvin.multithreading;

public class DispThread implements Runnable{
	String string;
	public DispThread(String m){
		string = m;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(string+"------------"+i);	
		}
	}
}
