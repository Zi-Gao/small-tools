import java.util.Scanner;
public class Forward {
	static public void Core() {
		long b = 8;
		System.out.println("    \r\n"+
				"|---------|\r\n"+
				"|         |\r\n"+
				"|    +    |\r\n"+
				"|         |\r\n"+
				"|---------|\r\n");
		Scanner sc = new Scanner(System.in);
		for (String a;true;) {
			a = sc.nextLine();
			if("w".equals(a)) {
				b = b - 3;
			}else if("a".equals(a)) {
				b = b - 1;
			}else if("s".equals(a)) {
				b = b + 3;
			}else if("d".equals(a)) {
				b = b + 1;
			}
			if(b == 4) {
				System.out.println("    \r\n"+
						"|---------|\r\n"+
						"| +       |\r\n"+
						"|         |\r\n"+
						"|         |\r\n"+
						"|---------|\r\n");
			}else if(b == 5) {
				System.out.println("    \r\n"+
						"|---------|\r\n"+
						"|    +    |\r\n"+
						"|         |\r\n"+
						"|         |\r\n"+
						"|---------|\r\n");
			}else if(b == 6) {
				System.out.println("    \r\n"+
						"|---------|\r\n"+
						"|       + |\r\n"+
						"|         |\r\n"+
						"|         |\r\n"+
						"|---------|\r\n");
			}else if(b == 7) {
				System.out.println("    \r\n"+
						"|---------|\r\n"+
						"|         |\r\n"+
						"| +       |\r\n"+
						"|         |\r\n"+
						"|---------|\r\n");
			}else if(b == 8) {
				System.out.println("    \r\n"+
						"|---------|\r\n"+
						"|         |\r\n"+
						"|    +    |\r\n"+
						"|         |\r\n"+
						"|---------|\r\n");
			}else if(b == 9) {
				System.out.println("    \r\n"+
						"|---------|\r\n"+
						"|         |\r\n"+
						"|       + |\r\n"+
						"|         |\r\n"+
						"|---------|\r\n");
			}else if(b == 10) {
				System.out.println("    \r\n"+
						"|---------|\r\n"+
						"|         |\r\n"+
						"|         |\r\n"+
						"| +       |\r\n"+
						"|---------|\r\n");
			}else if(b == 11) {
				System.out.println("    \r\n"+
						"|---------|\r\n"+
						"|         |\r\n"+
						"|         |\r\n"+
						"|    +    |\r\n"+
						"|---------|\r\n");
			}else if(b == 12) {
				System.out.println("    \r\n"+
						"|---------|\r\n"+
						"|         |\r\n"+
						"|         |\r\n"+
						"|       + |\r\n"+
						"|---------|\r\n");
			}else if(b < 4 | b > 12) {
				System.out.println("    \r\n"+
						"|---------|\r\n"+
						"|         |\r\n"+
						"|    +    |\r\n"+
						"|         |\r\n"+
						"|---------|\r\n");
				b = 8;
			}
		}
	}
	public static void main(String[] args) {
		Core();
	}
}
