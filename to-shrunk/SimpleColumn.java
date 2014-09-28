import java.util.Scanner;

public class SimpleColumn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Plain text: ");
		String plain = sc.nextLine();
		plain = plain.replaceAll("\\s", "");//<-- remove spaces
		plain = plain.toLowerCase();//<-- to lower case, if upper
		int max = plain.length();
		System.out.printf("No. of columns(max %d): ", max);
		int col = sc.nextInt();
		if(max < col || 0 > col) {
			sc.close();
			System.out.println("Out of range columns !");
			return;
		}
		StringBuilder sb = new StringBuilder();
		int row = max/col;
		for(int i = 0, c = 0; col > i; i ++) {
			System.out.printf("Pick Column from 1 - %d: ", col);
			c = sc.nextInt();
			if(col < c || 0 > c) {
				sc.close();
				System.out.println("Out of range column !");
				return;
			}
			for(int r = 0; row >= r; r ++) {
				try {
					sb.append(plain.charAt(r * col + c - 1));
				} catch (IndexOutOfBoundsException ex) {
					//ignore this, no char found for the given index
				}
			}
		}
		sc.close();
		System.out.printf("Cipher Text=%s\n", sb);
	}
}