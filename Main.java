/*
 * @Author: Zi_Gao
 * @Date: 2020-12-11 21:49:20
 * @LastEditTime: 2021-02-11 23:41:14
 * @LastEditors: Zi_Gao
 * @Description: 主类,入口
 * @FilePath: /Small-Tools/Main.java
 * @
 */

import java.util.Scanner;
	/**
  * @description: 用户交互
  * @param {String[]} null
  * @return {*} null
  */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("请输入你要在使用的工具编号\r\n1.最小公倍数计算\r\n2.多进制转换\r\n3.质数合数检测器");
            System.out.print("[1/2/3]:");
            String strToolID = sc.nextLine();
            if ("n".equals(strToolID) | "N".equals(strToolID)) {
                sc.close();
                break;
            }
            if (inputDetection.intType(strToolID) == 0) {
                int intToolID = Integer.valueOf(strToolID).intValue();
                if (intToolID == 1) {
                    leastCommonMultiple.main(args);
                } else if (intToolID == 2) {
                    binaryConversion.main(args);
                } else if (intToolID == 3) {
                    primeNumberDetection.main(args);
                }
            } else if (inputDetection.intType(strToolID) == 1) {
                System.out.println("请输入正确数字 [1-3]");
            } else if (Integer.valueOf(strToolID).intValue() > 3 && Integer.valueOf(strToolID).intValue() <= 0) {
                System.out.println("请输入正确数字 [1-3]");
            }
            System.out.print("是否继续? [Y/n]");
            String strSwitch = sc.nextLine();
            if ("n".equals(strSwitch) | "N".equals(strSwitch)) {
                break;
            }
        }
        sc.close();
    }
}