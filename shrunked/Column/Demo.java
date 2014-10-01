public class Demo {
	public static void main(String[] args) {
		String plain = "HelloWorld";
		System.out.printf("Original Text: %s\n", plain);
		plain = plain.toLowerCase();//<-- to lower case, if upper
		int max = plain.length();
		int col = 4, row = max/col;
		int[] pic = {1, 3, 2, 4};//pic columns
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
		System.out.printf("Cipher Text: %s\n", str);
	}
}