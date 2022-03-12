package day4;

import java.util.Iterator;
import java.util.Scanner;

public class pratice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// Bài 1: Viết chương trình nhập họ tên, điểm toán, điểm văn của 1 học sinh.
		// Tính điểm trung bình và xuất ra kết quả

		System.out.println("---- Bài 1 ----");

		System.out.println("Nhập tên: ");
		String hoTen = sc.next();

		System.out.println("Nhập điểm toán: ");
		float math = sc.nextFloat();

		System.out.println("Nhập điểm văn: ");
		float literature = sc.nextFloat();

		float tong = tinhDTB(math, literature);

		System.out.println("Điểm trung bình 2 môn là: " + tong);

		// Bài 2: Viết chương trình nhập n và tính tổng S = 1 + 2 + 3 + … + n

		System.out.println("---- Bài 2 ----");

		System.out.println("Nhập n: ");
		int n = sc.nextInt();

		tinhTongS(n);
		System.out.println("Tổng S là: " + tinhTongS(n));

		// Bài 3: Viết chương trình nhập n, x và tính tổng S(n) = x + x^2 + x^3 + … +
		// x^n

		System.out.println("---- Bài 3 ----");

		System.out.println("Nhập số nguyên x: ");
		int x = sc.nextInt();

		System.out.println("Nhập luỹ thừa n: ");
		int n1 = sc.nextInt();

		System.out.println("Kết quả là: " + tongBai3(x, n1));
		tongBai3(x, n1);

		// Bài 4: Cho số nguyên dương n. Kiểm tra xem n có phải là số nguyên tố hay
		// không

		System.out.println("---- Bài 4 ----");

		System.out.println("Nhập số nguyên dương a: ");
		int a = sc.nextInt();

		checkSNT(a);

		// Bài 5: Liệt kê tất cả các số nguyên tố nhỏ hơn n

		System.out.println("---- Bài 5 ----");

		System.out.println("Input b: ");
		int b = sc.nextInt();

		lietKeSNTNhoHon(b);

		// Bài 6: Tìm ước số lẻ lớn nhất của số nguyên dương n. Ví dụ n = 100 ước lẻ lớn
		// nhất là 25

		System.out.println("---- Bài 6 ----");

		System.out.println("Nhập số nguyên dương c: ");
		int c = sc.nextInt();

		// Bài 7: Tính tổng tất cả các "ước số chẵn" của số nguyên dương n

		System.out.println("---- Bài 7 ----");

		System.out.println("Nhập số nguyên dương d: ");
		int d = sc.nextInt();

		System.out.println("Tổng các ước số chẵn là: " + tongUocSoChan(d));
		tongUocSoChan(d);

		// Bài 8: Hãy tính tổng các chữ số chẵn của số nguyên dương n

		System.out.println("---- Bài 8 ----");

		System.out.println("Nhập số nguyên dương e: ");
		int e = sc.nextInt();

		System.out.println("Tổng các ước số chẵn là: " + tongSoChan(e));
		tongSoChan(e);
	}

	// Phương Thức

	// Bài 1

	public static float tinhDTB(float math, float literature) {
		return (math + literature) / 2;
	}

	// Bài 2

	public static int tinhTongS(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}

	// Bài 3

	public static int tongBai3(int x, int n1) {
		int soMu = 1;
		int sum = 0;
		for (int i = 0; i <= n1; i++) {// Xét luỹ thừa dc nhập từ n1, x = 2
			soMu = x * soMu; // 2*1,2*2,2*3,2*4
			sum = sum + soMu; // 2 + 4 + 8 + 16
		}
		return sum;
	}

	// Bài 4
	public static boolean checkSNT(int a) {
		if (a <= 1) {// Xét điều kiện
			return false;
		}
		for (int i = 2; i <= a / 2; i++) { // nhập a = 9, 9 / 2 = 4 ==> i chạy từ 2 -> 4
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Bài 5

	public static void lietKeSNTNhoHon(int b) {
		for (int i = 1; i < b; i++) {
			boolean lietKeSNTNhoHon = checkSNT(i);
			if (lietKeSNTNhoHon == true) {
				System.out.println("Prime Number: " + i);
			} else if (lietKeSNTNhoHon == false) {
				System.out.println("Not Prime Number: " + i);
			}
		}
	}

	// Bài 6
	public static int timUocSo(int c) {

		int max = 1;
		for (int i = 1; i < c; i++) { // c = 8
			if (c % i == 0 && i % 2 == 0) {// Lấy 8 chia lần lượt cho 1 2 3 4 5 6 7 8 và là số chẵn
				if (i > max) {
					max = i;// max = 1 ; max = 2 ; max = 4 ; max = 8
				}
			}
		}
		return max;
	}

	// Bài 7
	public static int tongUocSoChan(int d) {
		int sum = 0;
		for (int i = 1; i < d; i++) { // d = 7
			if (d % i == 0 && i % 2 == 0) { // chia hết lần lượt từ 1 -> 7 và là số chẵn
				sum += i;
			}
		}
		return sum;
	}

	// Bài 8
	public static int tongSoChan(int e) {
		int sum = 0;
		while (e != 0) {
			int soCuoi = e % 10; 
			if (soCuoi % 2 == 0) {
				sum += soCuoi;
			}
			e = e / 10;
		}
		System.out.println("Sum: " + sum);
		return sum;
	}

}
