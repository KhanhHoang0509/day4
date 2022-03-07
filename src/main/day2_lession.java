package main;

public class day2_lession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Datatype varName [=value] [, varName2] [, varName3]
		// Kiểu số nguyên: byte, short, int, long
		// Kiểu số thực: float, double
		// Kiểu logic: boolean (true/false)
		// Kiểu ký tự: char -> chỉ lưu 1 ký tự
		// Kiểu chuỗi: string -> lưu chuỗi bất kỳ

		int numberStudent = 10;
		float countNumberTeacher = 10.5f;
		boolean skyisraining = false;
		char myName = 'K';
		String myClass = "JDEV-D014";

		System.out.println("Number student = " + numberStudent);
		System.out.println("Count number teacher = " + countNumberTeacher);
		System.out.println("Sky is raining = " + skyisraining);
		System.out.println("My name = " + myName);
		System.out.println("My class is = " + myClass);

		// In tên
		printMyName();
		System.out.println("Count student: " + countNumberTeacher);

		// Tính tổng
		int total = sumA(20);
		System.out.println("Total: " + total);

		int totalCandD = sumCandD(15, 20);
		System.out.println("Total: " + totalCandD);
	}

	public static void printMyName() {
		System.out.println("My name: Khanh Hoang");
	}

	public static float countStudent() {
		return 10.5f;
	}

	public static int sumA(int a) {
		return 10 + a;
	}

	public static int sumCandD(int c, int d) {
		return c + d;
	}

}
