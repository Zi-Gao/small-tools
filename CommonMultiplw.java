import java.util.Scanner;

public class CommonMultiplw {//��ȡ��С������
	
	static public void Core(long a,long b) {//������
		long c;
		if(a>b) {//�򹫱�������С����С�������Դ���С������ʼ��
			c = a;
		}
		c = b;
		for(;true;c++) {
			if(c % a == 0 && c % b ==0) {//�����������ִ�����
				System.out.println(a+"��"+b+"����С�������ǣ�"+c);//�����
				break;//ֹͣѭ��
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������1:");
		long a = sc.nextInt();
		System.out.println("���������2:");
		long b = sc.nextInt();
		CommonMultiplw.Core(a, b);
	}
	
}
