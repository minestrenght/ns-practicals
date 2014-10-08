public class Demo {
	public static String encode(String plain) {
		int max = plain.length();
		int col = 6, row = max/col;
		int[] pic = {4,6,1,2,5,3};//pic columns
		String str = "";
		for(int i = 0, c = 0; col > i; i ++) {
			for(int r = 0; row >= r; r ++) {
				try {
					str += plain.charAt(r * col + pic[i] - 1);
				} catch (IndexOutOfBoundsException ex) {
					//ignore this, no char found for the given index
				}
			}
		}
		return str;
	}
	public static void main(String[] args) {
		String plain = "ComeHomeTomorrow";//<-- no spaces
		System.out.printf("Original Text: %s\n", plain);
		plain = plain.toLowerCase();//<-- to lower case, if upper
		String str = encode(encode(plain));//<-- two rounds
		System.out.printf("Cipher Text: %s\n", str);
	}
}