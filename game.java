import java.util.Scanner;

public class game {
	static public void Core() {
		int b = 8;
		System.out.println("    \r\n" + "|---------|\r\n" + "|         |\r\n" + "|    +    |\r\n" + "|         |\r\n"
				+ "|---------|\r\n");
		for (String a; true;) {
			Scanner sc = new Scanner(System.in);
			a = sc.nextLine();
			if ("w".equals(a)) {
				b = b - 3;
			} else if ("a".equals(a)) {
				b = b - 1;
			} else if ("s".equals(a)) {
				b = b + 3;
			} else if ("d".equals(a)) {
				b = b + 1;
			}
			if (b == 4) {
				System.out.println("    \r\n" + "|---------|\r\n" + "| +       |\r\n" + "|         |\r\n"
						+ "|         |\r\n" + "|---------|\r\n");
				sc.close();
			} else if (b == 5) {
				System.out.println("    \r\n" + "|---------|\r\n" + "|    +    |\r\n" + "|         |\r\n"
						+ "|         |\r\n" + "|---------|\r\n");
				sc.close();
			} else if (b == 6) {
				System.out.println("    \r\n" + "|---------|\r\n" + "|       + |\r\n" + "|         |\r\n"
						+ "|         |\r\n" + "|---------|\r\n");
				sc.close();
			} else if (b == 7) {
				System.out.println("    \r\n" + "|---------|\r\n" + "|         |\r\n" + "| +       |\r\n"
						+ "|         |\r\n" + "|---------|\r\n");
				sc.close();
			} else if (b == 8) {
				System.out.println("    \r\n" + "|---------|\r\n" + "|         |\r\n" + "|    +    |\r\n"
						+ "|         |\r\n" + "|---------|\r\n");
				sc.close();
			} else if (b == 9) {
				System.out.println("    \r\n" + "|---------|\r\n" + "|         |\r\n" + "|       + |\r\n"
						+ "|         |\r\n" + "|---------|\r\n");
				sc.close();
			} else if (b == 10) {
				System.out.println("    \r\n" + "|---------|\r\n" + "|         |\r\n" + "|         |\r\n"
						+ "| +       |\r\n" + "|---------|\r\n");
				sc.close();
			} else if (b == 11) {
				System.out.println("    \r\n" + "|---------|\r\n" + "|         |\r\n" + "|         |\r\n"
						+ "|    +    |\r\n" + "|---------|\r\n");

				sc.close();
			} else if (b == 12) {
				System.out.println("    \r\n" + "|---------|\r\n" + "|         |\r\n" + "|         |\r\n"
						+ "|       + |\r\n" + "|---------|\r\n");
				sc.close();
			} else if (b < 4 | b > 12) {
				System.out.println("    \r\n" + "|---------|\r\n" + "|         |\r\n" + "|    +    |\r\n"
						+ "|         |\r\n" + "|---------|\r\n");
				sc.close();
				b = 8;
			}
		}
	}

	public static void main(String[] args) {
		Core();
	}
}
