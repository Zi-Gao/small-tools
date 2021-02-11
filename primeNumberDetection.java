/*
 * @Author: Zi_Gao
 * @Date: 2020-12-11 21:49:20
 * @LastEditTime: 2021-02-11 23:40:04
 * @LastEditors: Zi_Gao
 * @Description: 质数检测器
 * @FilePath: /Small-Tools/primeNumberDetection.java
 * @
 */

import java.util.Scanner;

public class primeNumberDetection {
	/**
  * @description: 用户交互
  * @param {String[]} null
  * @return {*} null
  */
	public static void main(String[] args) {
		long longInputValue;
		Scanner sc = new Scanner(System.in);
		System.out.println("输入需要检查的数");
		String strInputValue = sc.nextLine();
		if (inputDetection.longType(strInputValue) == 0) {
			longInputValue = Long.valueOf(strInputValue).longValue();
			int returnValue = primeNumberDetection.Core(longInputValue);
			if (returnValue ==  0){
				System.out.println("质数");
			}else if (returnValue == 1){
				System.out.println("合数");
			}else{
				System.out.println("不属于合数,也不属于质数");
			}
		} else if (inputDetection.longType(strInputValue) == 1) {
			System.out.println("请输入正确数字");
		}
	}
 /**
  * @description: 
  * @param {long} 输入被检测的数
  * @return {int} 0表示输入值为质数 1表示输入值为合数 2表示输入值不属于质数合数范畴(输入值<2)
  */
	public static int Core(long inputValue) {
		long longMultiplier = 2;
		long oneHalfInputValue = inputValue/2;
		int returnValue = 0;
		if (inputValue < 2){
			returnValue = 2;
			return returnValue;
		}
		for (;longMultiplier <= oneHalfInputValue;longMultiplier++){
			if (inputValue%longMultiplier == 0){
				returnValue = 1;
				break;
			}
		}
		return returnValue;
	}
}