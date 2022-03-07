package main;

public class day3_lession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 20;
		int b = 10;
		if (a < b) {
			System.out.println("a smaller than b");
		} else if (a == b) {
			System.out.println("a equals to b");
		} else {
			System.out.println("b smaller than a");
		}

		// If else
		// Cách 1
		int result1 = 0;

		if (a > b) {
			result1 = a - b;
		} else {
			result1 = a + b;
		}

		System.out.println("Result1: " + result1);

		// Cách 2: viết tắt chỉ dành cho if else
		int result2 = a > b ? a - b : a + b;
		System.out.println("Result2: " + result2);

		// Switch case
		int num = 2;
		switch (num) {
		case 1:
			System.out.println("red");
			break;
		case 2:
			System.out.println("blue");
			break;
		}

		// Switch case gom nhiều diều kiện giống nhau
		int month = 12;
		switch (month) {
		case 1:
		case 3:
		case 5:
			System.out.println("31 days");
			break;
		case 4:
		case 6:
		case 9:
			System.out.println("30 days");
			break;
		case 10:
			System.out.println("30 days");
			break;
		default: // Khi ko thoả mãn các case
			System.out.println("default");
			break;
		}
	}

}
