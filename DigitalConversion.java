import java.util.Scanner;

public class DigitalConversion {//多进制转换
	
	static public void Core(int a,long b) {//核心

		
		if (a == 1){
			System.out.println(b + "二进制是:" + Long.toBinaryString(b) );
		}else if (a == 2){
			System.out.println(b + "八进制是:" + Long.toOctalString(b) );
		}else if(a == 3){
			System.out.println(b + "十六进制是:" + Long.toHexString(b));
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要转换的编号\r\n1.十进制转二进制\r\n2.十进制转八进制\r\n3.十进制转十六进制");
		int a = sc.nextInt();
		System.out.println("要转换的数字");
		long b = sc.nextLong();
		Core(a, b);
	}
	
}
