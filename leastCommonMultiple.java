import java.util.Scanner;

public class leastCommonMultiple {
	public static long Core(long[] multiplierArr) {// 核心
		long returnValue = 0;
		for (long longMultiplier : multiplierArr) {// 优化,从最大的数开始试,因为最小公倍数不可能小于最大的数
			if (longMultiplier == 0) {// 已经结束
				break;// 停止
			} else if (Long.valueOf(longMultiplier).intValue() > returnValue) {// 若有更大的就赋值
				returnValue = Long.valueOf(longMultiplier).intValue();// 赋值
			}
		}
		loop: for (; true; returnValue++) {// 暴力搜寻
			if (returnValue == Long.MAX_VALUE) {// 防溢出
				break;// 停止
			}
			for (long longMultiplier : multiplierArr) {// 数组测试
				// System.out.println(b);
				if (longMultiplier == 0) {// 若为0表示已经结束,停止
					break loop;
				} else if (returnValue % Long.valueOf(longMultiplier).intValue() != 0) {// 如果不对就继续
					continue loop;// 结束本次循环
				}
			}
		}
		return returnValue;
	}

	public static void main(String[] args) {// 主方法
		Scanner sc = new Scanner(System.in);// new控制台输入
		int i = 0;// 记录输入次数
		long[] multiplierArr = new long[1024];
		for (;;) {// 重复输入
			if (i == 1024) {// 防溢出
				System.out.println("此程序记录因数个最多为1024,现在为1024,继续将会溢出,已自动停止");// 输出
				break;// 停止
			}
			System.out.println("请输入因数.输入0为开始计算");// 打印标题引导用户输入
			String inputMultiplie = sc.nextLine();// 输入方法
			if (inputDetection.longType(inputMultiplie) == 1 | inputMultiplie == null) {// 防溢出,防止直接输入null
				System.out.println("请输入数字,并为Long类型,请重新输入");// 打印并跳过本次循环
				continue;
			}
			multiplierArr[i] = Long.valueOf(inputMultiplie);// 存入
			i++;// 自增
			if (Long.valueOf(inputMultiplie).longValue() == 0) {// 调用核心运算
				if(leastCommonMultiple.Core(multiplierArr) == 0){
					System.out.println("最小公倍数达到9223372036854775807,无法继续运算");
				}
				System.out.println("最小公倍数为:" + leastCommonMultiple.Core(multiplierArr));// 调用核心
				break;
			}
		}
	}
}