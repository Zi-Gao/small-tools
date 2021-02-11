/*
 * @Author: Zi_Gao
 * @Date: 2020-12-11 21:49:20
 * @LastEditTime: 2021-02-11 23:29:38
 * @LastEditors: Zi_Gao
 * @Description: 检测输入是否为正确类型
 * @FilePath: /Small-Tools/inputDetection.java
 * @
 */

public class inputDetection{
    /**
     * @description: int类型输入检测
     * @param {String} 输入被检测的字符串
     * @return {int} 0表示输入值是int值 1表示输入值不是int值
     */
    public static int intType(String Input) {
        int returnInt;
        try {
            Integer.valueOf(Input).intValue();
            returnInt = 0;
        } catch (Exception e) {
            returnInt = 1;
        }
    return returnInt;
    }
        /**
     * @description: long类型输入检测
     * @param {String} 输入被检测的字符串
     * @return {int} 0表示输入值是long值 1表示输入值不是long值
     */
    public static int longType(String Input) {
        int returnInt;
        try {
            Long.valueOf(Input).intValue();
            returnInt = 0;
        } catch (Exception e) {
            returnInt = 1;
        }
    return returnInt;
    }
}