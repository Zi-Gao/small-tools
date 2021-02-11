/*
 * @Author: Zi_Gao
 * @Date: 2020-12-11 21:49:20
 * @LastEditTime: 2021-02-11 23:31:13
 * @LastEditors: Zi_Gao
 * @Description: 多进制互相转换
 * @FilePath: /Small-Tools/binaryConversion.java
 * @
 */

import java.util.Scanner;
public class binaryConversion {
 /**
  * @description: 核心方法 进行转换工作
  * @param {String} 被转换的数
  * @param {int} 被转换的数的进制[2/8/10/16]进制
  * @param {int} 转换后的进制[2/8/10/16]进制
  * @return {String} 输出 为数则转换正确 否则输出为Error,输出错误
  */
	static public String Core(String strInputNum, int strInputNumType, int strReturnNumType) {
		System.out.println("转换结果为");
		String returnNum = "Error";
		long decimalNumbers = Long.parseLong(strInputNum, strInputNumType);
		if (strReturnNumType == 2) {
			returnNum = Long.toBinaryString(decimalNumbers);
		} else if (strReturnNumType == 8) {
			returnNum = Long.toOctalString(decimalNumbers);
		} else if (strReturnNumType == 16) {
			returnNum = Long.toHexString(decimalNumbers);
		} else if (strReturnNumType == 10) {
			returnNum = Long.valueOf(decimalNumbers).toString();
		}
		return returnNum;
	}
	/**
  * @description: 用户交互
  * @param {String[]} null
  * @return {*} null
  */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("请输入被转换的数");
			String strInputNum = sc.nextLine();
			String strInputNumType = "1";
			String strReturnNumType = "1";
			while (true) {
				System.out.println("要将什么进制的数进行转换");
				strInputNumType = sc.nextLine();
				if (inputDetection.intType(strInputNumType) == 1) {
					System.out.println("请输入 2,8,10,16 进制");
					continue;
				} else if (Integer.valueOf(strInputNumType).intValue() != 2 && Integer.valueOf(strInputNumType).intValue() != 8
						&& Integer.valueOf(strInputNumType).intValue() != 10 && Integer.valueOf(strInputNumType).intValue() != 16) {
					System.out.println("请输入 2,8,10,16 进制");
					continue;
				} else {
					break;
				}
			}

			while (true) {
			System.out.println("转换为几进制的数");
			strReturnNumType = sc.nextLine();
				if (inputDetection.intType(strReturnNumType) == 1) {
					System.out.println("请输入 2,8,10,16 进制");
					continue;
				} else if (Integer.valueOf(strReturnNumType).intValue() != 2 && Integer.valueOf(strReturnNumType).intValue() != 8
						&& Integer.valueOf(strReturnNumType).intValue() != 10 && Integer.valueOf(strReturnNumType).intValue() != 16) {
					System.out.println("请输入 2,8,10,16 进制");
					continue;
				} else {
					break;
				}
			}
			System.out.println(binaryConversion.Core(strInputNum, Integer.valueOf(strInputNumType), Integer.valueOf(strReturnNumType)));
			break;
		}
	}
}
