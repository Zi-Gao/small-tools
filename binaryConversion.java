import java.util.Scanner;

public class binaryConversion {// 多进制转换
	static public void Core(String num, int num1, int num2) {// 核心
		System.out.println("转换结果为");
		String numInput = "Error";
		long decimalNumbers = Long.parseLong(num, num1);
		if (num2 == 2) {
			numInput = Long.toBinaryString(decimalNumbers);
		} else if (num2 == 8) {
			numInput = Long.toOctalString(decimalNumbers);
		} else if (num2 == 16) {
			numInput = Long.toHexString(decimalNumbers);
		} else if (num2 == 10) {
			numInput = Long.valueOf(decimalNumbers).toString();
		}
		System.out.println(numInput);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			System.out.println("请输入被转换的数");
			String str = sc.nextLine();
			System.out.println("要将什么进制的数进行转换");
			String str1 = sc.nextLine();
			if (InputDetection.intType(str1) == 1) {// 防溢出
				System.out.println("请输入 2,8,10,16 进制");
			} else if (Integer.valueOf(str1).intValue() != 2 && Integer.valueOf(str1).intValue() != 8 && Integer.valueOf(str1).intValue() != 10 && Integer.valueOf(str1).intValue() != 16) {
				System.out.println("请输入 2,8,10,16 进制");
				continue;
			}
			System.out.println("转换为几进制的数");
			String str2 = sc.nextLine();
			if (InputDetection.intType(str2) == 1 && Integer.valueOf(str1).intValue() != 2 && Integer.valueOf(str2).intValue() != 8 && Integer.valueOf(str1).intValue() != 10 && Integer.valueOf(str2).intValue() != 16) {// 防溢出
				System.out.println("请输入 2,8,10,16 进制");
				continue;
			}
			sc.close();
			binaryConversion.Core(str, Integer.valueOf(str1), Integer.valueOf(str2));
		}
	}
}
