import java.util.Scanner;

public class PrimeNumber {//质数合数检测器
	public static void main(String[] args) {
		long a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("输入需要检查的数");
		a = sc.nextLong();
		c = a/2;//目标数的一\半，应为一半以后会重复
		if(a % 2 == 1) {//奇数java会余1把1加上
			c = c + 1;
		}
		for (b = 2;b<=c;b++) {//挨个试
			if(a%b==0) {
				System.out.println("合数");//出现一次处了1和目标数本生的数就输出合数
				break;
			}
		}
		if(c==b-1 && a!=1) {//b循环到了最后表示是质数但是b在最后一次还会+1把1减去
			System.out.println("质数");
		}else if(a==1){
			System.out.println("1既不是质数也不是合数");
		}
	}
}