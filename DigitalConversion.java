import java.util.Scanner;

public class DigitalConversion {//多进制转换
	
	static public void Core(Long a,long b) {//核心
		if (a == 1){
			System.out.println(b + "的二进制是:" + Long.toBinaryString(b) );
		}else if (a == 2){
			System.out.println(b + "的八进制是:" + Long.toOctalString(b) );
		}else if(a == 3){
			System.out.println(b + "的十六进制是: 0x" + Long.toHexString(b));
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long a,b;
		System.out.println("请输入要转换的编号\r\n1.十进制转二进制\r\n2.十进制转八进制\r\n3.十进制转十六进制");
		String str1 = sc.nextLine();
		System.out.println("要转换的数字");
		String str2 = sc.nextLine();
		if (Lnput.CoreLong(str1) == 0 && Lnput.CoreLong(str2) == 0){//检测是否超过Long值
			a = Long.valueOf(str1).longValue();
			b = Long.valueOf(str2).longValue();
			DigitalConversion.Core(a, b);
		}else if(Lnput.CoreLong(str1) == 1 | Lnput.CoreLong(str2) == 1){//若不是则输出
			System.out.println("请输入Long值");
		}else if(Long.valueOf(str1).longValue() > 3){
			System.out.println("请输入正确数字 [1-3]");
		}
	}
}
