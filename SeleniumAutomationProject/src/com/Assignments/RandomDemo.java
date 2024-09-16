package com.Assignments;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		Random rnd = new Random();
		int n = rnd.nextInt(6);	//This will generage a random number in the range of 0 to 5
		System.out.println(n);
	}

}
