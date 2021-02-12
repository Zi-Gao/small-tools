import java.util.Arrays;

/*
 * @Author: Zi_Gao
 * @Date: 2021-02-12 10:00:48
 * @LastEditTime: 2021-02-12 21:12:08
 * @LastEditors: Zi_Gao
 * @Description: 这是个可以求多个数公因数(公约数)的工具
 * @FilePath: /Small-Tools/conventionNumber.java
 * @
 */

import java.util.Scanner;

public class conventionNumber {
    /**
     * @description: 核心方法 进行穷举求公因数(公约数)
     * @param {long[]} 一维数组 每个数必须是正整数  注意：数组必须连续,不能出现{5,8,6,0,9}的情况 
     * @return {long[]} 数组没有任何数表示它们互质
     */
    public static long[] Core(long[] numberArr) {
        long conventionNumber = 2;
        long smallestInputNumber = numberArr[0];
        int numberOfconventionNumber = 0;//公因数(公约数)个数
        int numberOfinputNumber = 0;//输入数个数
        for (long tmpNumber : numberArr) {//找出数组中最大的数 并 得到输入数的个数
            if (tmpNumber == 0 | numberOfinputNumber == numberArr.length){
                break;
            }
            if (smallestInputNumber > tmpNumber) {
				smallestInputNumber = tmpNumber;
            }
            numberOfinputNumber++;
        }
        long[] conventionNumberArr = new long[numberOfinputNumber];//临时的公因数(公约数)数组 是不返回值
        while (true) {
            int i = 1;
            testConventionNumber:for(long tmp : numberArr) {
                if (tmp%conventionNumber != 0) {
                    //测试未通过
                    i = 0;
                    break testConventionNumber;
                }else if(i == numberOfinputNumber) {
                    //测试通过,记录
                    conventionNumberArr[numberOfconventionNumber] = conventionNumber;
                    numberOfconventionNumber++;
                    i = 0;
                    break testConventionNumber;
                }
                i++;
            }
            if (conventionNumber == smallestInputNumber){
                break;
            }
            conventionNumber++;
        }
        long[] returnArr = Arrays.copyOf(conventionNumberArr, numberOfconventionNumber);
        return returnArr;
    }
    /**
  * @description: 用户交互
  * @param {String[]} null
  * @return {*} null
  */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        long[] numberArr = new long[1024];
        while (true) {
            if (i == 1023){
                System.out.println("无法继续,输入数字过多");
            }
            System.out.println("请输入要求公因数(公约数)的数,输入0开始计算 (可以是多个数)");
            String inputNumber = sc.nextLine();
            if (inputDetection.longType(inputNumber) == 1 | inputNumber == null) {
				System.out.println("请输入数字,并为Long类型,请重新输入");
				continue;
            }
            if (Long.valueOf(inputNumber).longValue() == 0) {
                long [] conventionNumberArr = conventionNumber.Core(numberArr);
                System.out.print("最小公倍数(无返回表示它们互质): ");
                for (long conventionNumber : conventionNumberArr){
                    System.out.print(conventionNumber + "  ");
                }
                System.out.println();
				break;
			}
            numberArr[i] = Long.valueOf(inputNumber);
            i++;
        }
    }
}
