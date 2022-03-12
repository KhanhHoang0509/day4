package day4;

import java.util.Scanner;

public class lession4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Cú pháp for

		// For (giá trị khởi tạo ; [điều kiện lặp] ; [bước nhảy]){
		// Nội dung thoả điều kiện lặp
		// }

		System.out.println("---- For ----");
		// In từ 1 -> 5
		for (int i = 1; i < 6; i++) {
			System.out.println(i);
		}

		// In từ 1-> 50
		for (int i = 0; i < 51; i = i + 5) {
			System.out.println(i);
		}

	// Cú pháp while

		// Giá trị khởi tạo
		// While (điều kiện lặp){
		// nội dung
		// bước nhảy
		// }

		// in while từ 1 -> 5
		System.out.println("---- While ----");
		int i = 1;
		while (i < 6) {
			System.out.println(i);
			i++;
		}
		
	// Cú pháp do while
		
		// Giá trị khởi tạo
		//do{
			// Nội dung thực hiện
			// Bước nhảy
		//} while (điều kiện lặp)
		
		System.out.println("---- Do-While ----");
		int a = 1;
		do {
			System.out.println(a);
			a++;
		} while (a < 6);
		
		// For, while thực hiện khi điều kiện đúng
		// do -while thực hiện 1 lần nếu điều kiện ko đúng
		
	// Break thoát ra khỏi vòng lặp hiện tại
		System.out.println("---- Break-For ----");
		// in từ -> 5
		for (int j = 1; j < 6; j++) {
			if (j == 4) {
				break;
			}
			System.out.println(j);
		}
		
		System.out.println("---- Break - For - For ----");
		for (int x = 0; x <= 5; x++) {
			System.out.print(x + ": ");
			for (int y = 0; y <= 5; y++) {
				if (y == 4) {
					break;
				}
				System.out.print(y + " ");
			}
			System.out.println();
		}
		
	// Continue
		System.out.println("---- Continue - For ----");
		for (int x = 0; x <= 5; x++) {
			System.out.print(x + ": ");
			for (int y = 0; y <= 5; y++) {
				if (y == 4) {
					continue;
				}
				System.out.print(y + " ");
			}
			System.out.println();
		}
	
	// Breakpoint -> đặt tại dòng kiểm tra lỗi
	// f6 -> đi đến dòng kế tiếp
	// f8 -> nhảy đến breakpoint kế tiếp
	// f5 nhảy vào trong 1 phương thức
	// Kiểm tra giá trị của 1 biến, rê chuột vào nó
		
		printNumber();
		
		for (int x = 0; x <= 5; x++) {
			System.out.print(x + ": ");
			for (int y = 0; y <= 5; y++) {
				if (y == 4) {
					continue;
				}
				System.out.print(y + " ");
			}
			System.out.println();
		}
	// Scanner
		Scanner sc = new Scanner(System.in);
		int myInt = sc.nextInt();
		float myFloat = sc.nextFloat();
		String myString = sc.next();
		
		System.out.println(myInt);
		System.out.println(myFloat);
		System.out.println(myString);
	}
	
	public static void printNumber() {
		System.out.println("1");
		System.out.println("2");
	}
}
