import java.util.Scanner;

public class PrimeNumber {//�������������
	public static void main(String[] args) {
		long a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ������");
		a = sc.nextInt();
		c = a/2;//Ŀ������һ\�룬ӦΪһ���Ժ���ظ�
		if(a % 2 == 1) {//����java����1��1����
			c = c + 1;
		}
		for (b = 2;b<=c;b++) {//������
			if(a%b==0) {
				System.out.println("����");//����һ�δ���1��Ŀ���������������������
				break;
			}
		}
		if(c==b-1 && a!=1) {//bѭ����������ʾ����������b�����һ�λ���+1��1��ȥ
			System.out.println("����");
		}else if(a==1){
			System.out.println("1�Ȳ�������Ҳ���Ǻ���");
		}
	}
}
