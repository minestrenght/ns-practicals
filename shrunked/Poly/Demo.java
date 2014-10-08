public class Demo {
	public static void main(String[] args) {
		char[] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		String plain = "helloworld", str = "", key = "olympic";
		System.out.printf("Original text: %s\n", plain);
		char[][] matrix = new char[26][26];
        for(int r = 0; matrix.length > r; r ++)
            for(int c = 0, k = r; matrix[r].length > c; c ++, k = (k + 1) % alpha.length)
                matrix[r][c] = alpha[k];
        while(key.length() < plain.length())
            key += key;
        key = key.substring(0, plain.length());
        for(int i = 0, r = 0, c = 0; plain.length() > i; i ++) {
            r = key.charAt(i) - alpha[0];
            c = plain.charAt(i) - alpha[0];
            str += matrix[r][c];
        }
		System.out.printf("Encoded text: %s\n", str);
		plain = "";
        for(int i = 0, r = 0; key.length() > i; i ++) {
            r = key.charAt(i) - alpha[0];
            for(int c = 0, a = str.charAt(i); matrix[r].length > c; c ++) {
                if(a == matrix[r][c]) {
                    plain += matrix[0][c];
                    break;
                }
            }
        }
		System.out.printf("Decoded text: %s\n", plain);
	}
}