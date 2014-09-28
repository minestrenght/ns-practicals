public class Demo {
	public static void main(String[] args) throws Exception {
		String plain = "hello world", str = "";
		System.out.printf("Original text: %s\n", plain);
		for(char c : plain.toCharArray()) {
			if(32 == c) str += c;
			else if(255 == c) str += (char)(c - 23);
			else str += (char)(c + 3);
		}
		System.out.printf("Encoded text: %s\n", str);
		plain = "";
		for(char c : str.toCharArray()) {
			if(32 == c) plain += c;
			else if(232 == c) plain += (char)(c + 23);
			else plain += (char)(c - 3);
		}
		System.out.printf("Decoded text: %s\n", plain);
	}
}