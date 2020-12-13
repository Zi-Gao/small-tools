import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            System.out.println("请输入你要在使用的工具编号\r\n1.最小公倍数计算\r\n2.多进制转换\r\n3.质数合数检测器");
            String str = sc.nextLine();
            if ("n".equals(str) | "N".equals(str)) {
                sc.close();
                break;
            }
            int a;
            if ("game".equals(str)) {
                game.Core();
                continue;
            }
            if (InputDetection.intType(str) == 0) {// 检测是否超过Int值
                a = Integer.valueOf(str).intValue();
                if (a == 1) {
                    leastCommonMultiple.main(args);
                } else if (a == 2) {
                    binaryConversion.main(args);
                } else if (a == 3) {
                    primeNumberCombinationDetector.main(args);
                }
            } else if (InputDetection.intType(str) == 1) {// 若不是则输出
                System.out.println("请输入正确数字 [1-3]");
            } else if (Integer.valueOf(str).intValue() > 3 && Integer.valueOf(str).intValue() <= 0) {
                System.out.println("请输入正确数字 [1-3]");
            }
        }
    }
}
