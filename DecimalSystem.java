import java.util.Scanner;

public class DecimalSystem {//������ת��
	
	static public void Core(long  x) {//������
		System.out.print(x+"ת��Ϊ��������:");//����
		long i = 0;//i=Ŀ�����ĳ���
		long y[] = new long [] {9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9};//Ŀ����������
		for (;x >= 1;i++) {
			y[i]= x%2;//��xת����������������
			x = x/2;//��x���Զ�
		}
		i--;//��i�����һ�Σ����Լ�һ
		//i����Ŀ�����ĳ���
		//�ڽ�ȡy��ǰ��i��������Ŀ�����ĵ���(ת�������ƵĹ�ʽ����Ҫ����)
		for (;i>=0;i--) {//��i�Դ����¼�����i��Ϊÿ����������еĵڼ�����
			System.out.print(y[i]);//���y������i
			//i=0ʱֹͣ
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������:");
		long a = sc.nextInt();
		DecimalSystem.Core(a);
	}
	
}