import java.util.Scanner;

public class DigitalConversion {// 多进制转换
	static public void Core(long a, String b) {// 核心
		if (a == 1) {
			System.out.println(b + "的二进制是:" + Long.toBinaryString(Long.valueOf(b).longValue()));
		} else if (a == 2) {
			System.out.println(b + "的八进制是:" + Long.toOctalString(Long.valueOf(b).longValue()));
		} else if (a == 3) {
			System.out.println(b + "的十六进制是: 0x" + Long.toHexString(Long.valueOf(b).longValue()));
		} else if (a == 4) {
			System.out.println(b + "的十进制是" + Long.parseLong(b, 2));
		} else if (a == 5) {
			System.out.println(b + "的十进制是" + Long.parseLong(b, 8));
		} else if (a == 6) {
			System.out.println(b + "的十进制是" + Long.parseLong(b, 16));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"请输入要转换的编号\r\n\r\n---十进制与其他进制转换---\r\n1.十进制转二进制\r\n2.十进制转八进制\r\n3.十进制转十六进制\r\n\r\n---其他进制与十进制转换\r\n4.二进制转十进制\r\n5.八进制与十进制转换\r\n6.十六进制与十进制转换(不要输入带0x的值)");
		String str1 = sc.nextLine();
		System.out.println("要转换的数字");
		String str2 = sc.nextLine();
		if (Lnput.CoreLong(str1) == 0) {// 检测是否超过Long值
			DigitalConversion.Core(Long.valueOf(str1).longValue(), str2);//调用核心
			sc.close();
		} else if (Lnput.CoreLong(str1) == 1) {// 若不是则输出
			System.out.println("请输入Long值");
		} else if (Long.valueOf(str1).longValue() > 6) {
			System.out.println("请输入正确数字 [1-6]");
		}
	}
}
