/*
 * @Author: Zi_Gao
 * @Date: 2020-12-11 21:49:20
 * @LastEditTime: 2021-02-11 23:37:27
 * @LastEditors: Zi_Gao
 * @Description: 求最小公倍数
 * @FilePath: /Small-Tools/leastCommonMultiple.java
 * @
 */

import java.util.Scanner;

public class leastCommonMultiple {
	/**
  * @description: 核心方法 穷举公倍数
  * @param {long[]} 一维数组 每个数都为因数 需为正整数
  * @return {long} 最小公倍数 若输出异常则为数据太大,超出long最大限度
  */
	public static long Core(long[] multiplierArr) {
		long returnValue = 0;
		for (long longMultiplier : multiplierArr) {
			if (longMultiplier == 0) {
				break;
			} else if (Long.valueOf(longMultiplier).intValue() > returnValue) {
				returnValue = Long.valueOf(longMultiplier).intValue();
			}
		}
		loop: for (; true; returnValue++) {
			if (returnValue == Long.MAX_VALUE) {
				break;
			}
			for (long longMultiplier : multiplierArr) {
				if (longMultiplier == 0) {
					break loop;
				} else if (returnValue % Long.valueOf(longMultiplier).intValue() != 0) {
					continue loop;
				}
			}
		}
		return returnValue;
	}
	/**
  * @description: 用户交互
  * @param {String[]} null
  * @return {*} null
  */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		long[] multiplierArr = new long[1024];
		for (;;) {
			if (i == 1024) {
				System.out.println("此程序记录因数个最多为1024,现在为1024,继续将会溢出,已自动停止");
				break;
			}
			System.out.println("请输入因数,输入0为开始计算");
			String inputMultiplie = sc.nextLine();
			if (inputDetection.longType(inputMultiplie) == 1 | inputMultiplie == null) {
				System.out.println("请输入数字,并为Long类型,请重新输入");
				continue;
			}
			multiplierArr[i] = Long.valueOf(inputMultiplie);
			i++;
			if (Long.valueOf(inputMultiplie).longValue() == 0) {
				if(leastCommonMultiple.Core(multiplierArr) == 0){
					System.out.println("最小公倍数达到9223372036854775807,无法继续运算");
				}
				System.out.println("最小公倍数为:" + leastCommonMultiple.Core(multiplierArr));
				break;
			}
		}
	}
}