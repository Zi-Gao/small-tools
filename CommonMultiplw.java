import java.util.Scanner;

public class CommonMultiplw {
	static public void Core(final String[] arr) {// 核心
		long c = 1;
		for (String arrLong : arr) {// 优化,从最大的数开始试,因为最小公倍数不可能小于最大的数
			if (arrLong == null) {// 已经结束
				break;// 停止
			} else if (Long.valueOf(arrLong).intValue() > c) {// 若有更大的就赋值
				c = Long.valueOf(arrLong).intValue();// 赋值
			}
		}
		Loop: for (; true; c++) {// 暴力破解
			if (c == Long.MAX_VALUE) {// 防溢出
				System.out.println("此程序记录最小公倍数值为Long,现在为9223372036854775807,继续将会溢出,已自动停止");// 打印
				break;// 停止
			}
			for (String bStr : arr) {// 数组测试
				// System.out.println(b);
				if (bStr == null) {// 若为null表示已经结束,输入答案
					System.out.println("最小公倍数为:" + c);// 打印
					break Loop;// 停止
				} else if (c % Long.valueOf(bStr).intValue() != 0) {// 如果不对就试下一个数
					continue Loop;// 结束本次循环
				}
			}
		}
	}

	public static void main(String[] args) {// 主方法
		Scanner sc = new Scanner(System.in);// new控制台输入
		int i = 0;// 记录输入次数
		String[] arr = new String[320339960];
		for (; true;) {// 重复输入
			if (i == 320339960) {// 防溢出
				System.out.println("此程序记录因数个最多为320339960,现在为320339960,继续将会溢出,已自动停止");// 输出
				break;// 停止
			}
			System.out.println("请输入因数.输入0为开始计算");// 打印标题引导用户输入
			String str = sc.nextLine();// 输入方法
			if (Lnput.CoreLong(str) == 1 | str == null) {// 防溢出,防止直接输入null
				System.out.println("请输入数字,并为Long类型,请重新输入");// 打印并跳过本次循环
				continue;
			}
			if (Long.valueOf(str).longValue() == 0) {// 调用核心运算
				CommonMultiplw.Core(arr);// 调用核心
				sc.close();
				break;
			}
			if (Long.valueOf(str).longValue() != 0) {// 自增与存入数组
				arr[i] = str;// 存入
				i++;// 自增
			}
		}
	}
}