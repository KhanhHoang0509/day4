package day3;

public class practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Bài 1
		int z = 5;
		soChanLe(z);

		// Bài 2
		int num1 = 100;
		int num2 = 10;
		int num3 = 50;
		numLonNho(num1, num2, num3);
		

		// Bài 3
		int num4 = 101;
		numTrongKhoang(num4);

		// Bài 4
		int num5 = 3;
		int num6 = 2;
		int num7 = 1;
		numTangGiam(num5, num6, num7);

		// Bài 5
		int LCB = 650000;
		int TNCT = 11;
		double luong = luongNv(TNCT, LCB);
		System.out.println("luong nhan vien la: " + luong);

		// Bài 6
		int a = 50;
		int b = 0;
		giaiPT(a, b);

	}
	
		
	// Bai 1
	public static void soChanLe(int z) {
		if (z % 2 == 0) {
			System.out.println("Đây là số chẵn");
		} else {
			System.out.println("Đây là số lẻ");
		}
	}
	
	// Bai 2
	public static void numLonNho(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {
			System.out.println("num1 là số lớn nhất");
		}

		else if (num2 > num1 && num2 > num3) {
			System.out.println("num2 là số lớn nhất");
		}

		else {
			System.out.println("num 3 là số lớn nhất");
		}

	}
	
	// Bai 3
	public static void numTrongKhoang(int num4) {
		if (10 >= num4 || num4 <= 100) {
			System.out.println("num4 nằm trong khoảng 10 --> 100");
		} else {
			System.out.println("num4 không nằm trong khoảng 10 --> 100");
		}
	}
	
	// Bai 4
	public static void numTangGiam(int num5, int num6, int num7) {
		if (num7 > num6 && num6 > num5) {
			System.out.println("3 số trên theo thứ tự tăng dần");
		} else {
			System.out.println("3 số trên theo thứ tự giảm dần");
		}
	}

	
	// Bai 5
	public static double luongNv(int TNCT, int LCB) {
		if (TNCT < 12) {
			return (1.92f * LCB);
		}

		else if (12 <= TNCT || TNCT < 36) {
			return (2.34f * LCB);
		}

		else if (36 <= TNCT || TNCT < 60) {
			return (3 * LCB);
		}

		return (4.5f * LCB);
	}
	
	// Bai 6
	public static void giaiPT(int a, int b) {
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phương trình có vô số nghiệm");
			} else {
				System.out.println("Phương trình vô nghiệm");
			}

		} else {
			float x = -b / a;
			System.out.println("Phương trình có nghiệm là: " + x);
		}
	}
}




/*
 * 		// Bài 1
	if (z % 2 == 0) {
		System.out.println("Đây là số chẵn");
	} else {
		System.out.println("Đây là số lẻ");
	}

	// Bài 2
	if (num1 > num2 && num1 > num3) {
		System.out.println("num1 là số lớn nhất");
	}

	else if (num2 > num1 && num2 > num3) {
		System.out.println("num2 là số lớn nhất");
	}

	else {
		System.out.println("num 3 là số lớn nhất");
	}

	// Bài 3
	if (10 >= num4 || num4 <= 100) {
		System.out.println("num4 nằm trong khoảng 10 --> 100");
	} else {
		System.out.println("num4 không nằm trong khoảng 10 --> 100");
	}

	// Bài 4
	if (num7 > num6 && num6 > num5) {
		System.out.println("3 số trên theo thứ tự tăng dần");
	} else {
		System.out.println("3 số trên theo thứ tự giảm dần");
	}

	// Bài 5
	if (TNCT < 12) {
		float luong = 1.92f * LCB;
		System.out.println("Lương cơ bản là: " + luong);
	}

	else if (12 <= TNCT || TNCT < 36) {
		float luong = 2.34f * LCB;
		System.out.println("Lương cơ bản là: " + luong);
	}

	else if (36 <= TNCT || TNCT < 60) {
		int luong = 3 * LCB;
		System.out.println("Lương cơ bản là: " + luong);
	}

	else if (TNCT > 60) {
		float luong = 4.5f * LCB;
		System.out.println("Lương cơ bản là: " + luong);
	}

	// Bài 6
	if (a == 0) {
		if (b == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		} else {
			System.out.println("Phương trình vô nghiệm");
		}

	} else {
		float x = -b / a;
		System.out.println("Phương trình có nghiệm là: " + x);
	}

	// Bài 7
	int month = 2;
	switch (month) {
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		System.out.println("31 days");
		break;

	case 4:
	case 6:
	case 9:
	case 11:
		System.out.println("30 days");
		break;

	case 2:
		int year = 2022;

		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			System.out.println("29 days");
		} else {
			System.out.println("28 days");
		}
	}
 */

