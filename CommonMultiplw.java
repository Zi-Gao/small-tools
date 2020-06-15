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
		Long a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个因数");
		String str1 = sc.nextLine();
		System.out.println("请输入第二个因数");
		String str2 = sc.nextLine();
		if (Lnput.CoreLong(str1) == 0 && Lnput.CoreLong(str2) == 0){//检测是否超过Long值
			a = Long.valueOf(str1).longValue();
			b = Long.valueOf(str2).longValue();
			CommonMultiplw.Core(a, b);
		}else if(Lnput.CoreLong(str1) == 1 | Lnput.CoreLong(str2) == 1){//若不是则输出
			System.out.println("请输入Long值");
		}
	}
}