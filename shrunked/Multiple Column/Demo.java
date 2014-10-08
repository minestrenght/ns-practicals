public class Demo {
	public static void main(String[] args) {
		String plain = "welcome", str = "";
		System.out.printf("Original Text: %s\n", plain);
		int row = 3, col = plain.length() / row;
        if(0 < plain.length() % row)
            col ++;
        char org[][] = new char[row][col], hash = '#', tmp;
        for(int r = 0, i = 0; row > r; r ++)
            for(int c = 0; col > c; c ++)
                org[r][c] = i < plain.length() ? plain.charAt(i ++) : hash;
        for(int r = 0; row > r; r ++) {
            for(int c = 0; col > c; c ++) {
                if(c + 2 < col) {
                    tmp = org[r][c];
                    org[r][c] = org[r][c + 2];
                    org[r][c + 2] = tmp;
                }
            }
        }
        for(int r = 0; row > r; r ++) {
            for(int c = 0; col > c; c ++) {
                if(r + 2 < row) {
                    tmp = org[r][c];
                    org[r][c] = org[r + 2][c];
                    org[r + 2][c] = tmp;
                }
            }
        }
        for(char[] a : org)
            str += new String(a);
        System.out.printf("Encoded Text: %s\n", str);
        plain = "";
        for(int r = row - 1; 0 <= r; r --)
            for(int c = col - 1; 0 <= c; c --)
                if(hash != org[r][c])
                    plain += org[r][c];
        System.out.printf("Decoded Text: %s\n", plain);
	}
}