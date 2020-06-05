import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (;true;){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要在使用的工具编号\r\n1.最小公倍数计算\r\n2.多进制转换\r\n3.质数合数检测器\r\n4.小游戏");
            int a = sc.nextInt();
            if (a == 1){
                CommonMultiplw.main(args);
            }else if(a == 2){
                DigitalConversion.main(args);
            }else if(a == 3){
                PrimeNumber.main(args);
            }else if(a == 4){
                Forward.Core();
            }
        }
    }
}
