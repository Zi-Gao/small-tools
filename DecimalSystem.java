import java.util.Scanner;

public class DecimalSystem {//二进制转换
	
	static public void Core(long  x) {//主方法
		System.out.print(x+"转换为二进制是:");//标题
		long i = 0;//i=目标数的长度
		long y[] = new long [] {9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9};//目标数的数组
		for (;x >= 1;i++) {
			y[i]= x%2;//将x转化后的数存进数组中
			x = x/2;//将x除以二
		}
		i--;//因i多加了一次，所以减一
		//i就是目标数的长度
		//在截取y中前面i个数就是目标数的倒序(转化二进制的公式中需要倒序)
		for (;i>=0;i--) {//将i以此往下减并将i做为每次输出数组中的第几个数
			System.out.print(y[i]);//输出y数组中i
			//i=0时停止
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入参数:");
		long a = sc.nextInt();
		DecimalSystem.Core(a);
	}
	
}