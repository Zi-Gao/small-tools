import java.util.Scanner;

public class primeNumberCombinationDetector {// 质数合数检测器

	public static void main(String[] args) {
		long a;
		Scanner sc = new Scanner(System.in);
		System.out.println("输入需要检查的数");
		String str = sc.nextLine();
		if (InputDetection.longType(str) == 0) {// 检测是否超过Long值
			a = Long.valueOf(str).longValue();
			Core(a);
		} else if (InputDetection.longType(str) == 1) {// 若不是则输出
			System.out.println("请输入正确数字");
		}
	}

	public static void Core(Long InputDetection) {
		long c, b;
		c = InputDetection / 2;// 目标数的一半，应为一半以后会重复
		if (InputDetection % 2 == 1) {// 奇数java会余1把1加上
			c = c + 1;
		}
		for (b = 2; b <= c; b++) {// 挨个试
			if (InputDetection % b == 0) {
				System.out.println("合数");// 出现一次处了1和目标数本生的数就输出合数
				break;
			}
		}
		if (c == b - 1 && InputDetection >= 1) {// b循环到了最后表示是质数但是b在最后一次还会+1把1减去
			System.out.println("质数");
		} else if (InputDetection <= 1) {
			System.out.println("1既不是质数也不是合数");
		}
	}
}