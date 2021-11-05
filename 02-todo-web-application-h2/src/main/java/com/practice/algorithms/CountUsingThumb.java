package com.practice.algorithms;

public class CountUsingThumb {
	public static void main(String[] args) {

		int input = 9;

		if ((input % 8) == 1) {
			System.out.println("Thumb");
		}

		else if ((input % 4) == 3) {
			System.out.println("middle");
		}

		else if ((input % 8) == 5) {
			System.out.println("small");
		}

		else if ((input + 1) % 8 == 1 && ((input - 1) % 4 == 3) || ((input + 1) % 4 == 3) && ((input - 1) % 8 == 1)) {
			System.out.println("Index");
		}

		else {
			System.out.println("Ring");
		}
	}
}
