import java.util.Scanner;

public class CommonMultiplw {//获取最小公倍数
	
	static public void Core(long a,long b) {//主方法
		long c;
		if(a>b) {//因公倍数不会小于最小的数所以从最小的数开始试
			c = a;
		}
		c = b;
		for(;true;c++) {
			if(c % a == 0 && c % b ==0) {//如果满足条件执行语句
				System.out.println(a+"和"+b+"的最小公倍数是："+c);//输出答案
				break;//停止循环
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入参数1:");
		long a = sc.nextInt();
		System.out.println("请输入参数2:");
		long b = sc.nextInt();
		CommonMultiplw.Core(a, b);
	}
	
}
