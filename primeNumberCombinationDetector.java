import java.util.Scanner;

public class primeNumberCombinationDetector {// 质数合数检测器

	public static void main(String[] args) {
		long longInputValue;
		Scanner sc = new Scanner(System.in);
		System.out.println("输入需要检查的数");
		String strInputValue = sc.nextLine();
		if (inputDetection.longType(strInputValue) == 0) {// 检测是否超过Long值
			longInputValue = Long.valueOf(strInputValue).longValue();
			int returnValue = primeNumberCombinationDetector.Core(longInputValue);
			if (returnValue ==  0){
				System.out.println("质数");
			}else if (returnValue == 1){
				System.out.println("合数");
			}else{
				System.out.println("不属于合数,也不属于质数");
			}
		} else if (inputDetection.longType(strInputValue) == 1) {// 若不是则输出
			System.out.println("请输入正确数字");
		}
	}

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