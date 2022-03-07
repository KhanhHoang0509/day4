package main;

public class day2_exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Kiểu byte
		byte student = 127;
		System.out.println("Tổng học sinh là: " + student);

		// Kiểu short
		short teacher = 1;
		System.out.println("Có " + teacher + " giáo viên");

		// Kiểu int
		int motocycle = 200;
		System.out.println("Có hơn " + motocycle + " xe dưới hầm");

		// Kiểu long
		long building = 10;
		System.out.println("Toà nhà có " + building + " tầng");

		// KIểu float
		float water = 2.1f;
		System.out.println("Mỗi ngày nên uống hơn " + water + "l nước");

		// Kiểu double
		double pi = 3.14;
		System.out.println("Bán kính hình tròn là: " + pi);

		// Kiểu boolean
		boolean rain = false;
		System.out.println("Trời đang mưa: " + rain);

		// Kiểu char
		char name = 'K';
		System.out.println("Tên mình là: " + name);

		// Kiểu String
		String address = "Số 67, Nguyễn Thị Minh Khai, Phường Bến Thành, Quận 1, TP.HCM";
		System.out.println("Địa chỉ Green Academy là: " + address);

		// Hàm không trả về
		myName();

		// Tổng
		int sumResult = sum(20, 15);
		System.out.println("Tổng là: " + sumResult);

		// Hiệu
		int subtractionResult = subtraction(20, 15);
		System.out.println("Hiệu là: " + subtractionResult);

		// Tích
		int multiplicationResult = multiplication(20, 15);
		System.out.println("Tích là: " + multiplicationResult);

		// Thương
		float divisionresult = Division(20, 8);
		System.out.println("Thương là: " + divisionresult);

		// Chu vi hình chữ nhật
		int chuViHcnResult = chuViHcn(100, 20);
		System.out.println("Chu vi hình chữ nhật là: " + chuViHcnResult);

		// Diện tích hình chữ nhật
		int dienTichHcnResult = dienTichHcn(100, 20);
		System.out.println("Diện tích hình chữ nhật là: " + dienTichHcnResult);

		// Chu vi hình vuông
		int chuViHvResult = chuViHv(10);
		System.out.println("Chu vi hình vuông là: " + chuViHvResult);

		// Diện tích hình vuông
		int dienTichHvResult = dienTichHv(10);
		System.out.println("Diện tích hình vuông là: " + dienTichHvResult);

	}

	// Hàm trả về
	public static void myName() {
		System.out.println("Tên mình là Khánh Hoàng");
	}

	// Tổng
	public static int sum(int firstNum, int secondNum) {
		return firstNum + secondNum;
	}

	// Hiệu
	public static int subtraction(int firstNum, int secondNum) {
		return firstNum - secondNum;
	}

	// Tích
	public static int multiplication(int firstNum, int secondNum) {
		return firstNum * secondNum;
	}

	// Thương
	public static float Division(int firstNum, int secondNum) {
		return firstNum / secondNum;
	}

	// Chu vi hình chữ nhật
	public static int chuViHcn(int l, int w) {
		return (l + w) * 2;
	}

	// Diện tích hình chữ nhật
	public static int dienTichHcn(int l, int w) {
		return l * w;
	}

	// Chu vi hình vuông
	public static int chuViHv(int p) {
		return p * 4;
	}

	// Diện tích hình vuông
	public static int dienTichHv(int p) {
		return p * p;

	}

}
