public class Demo {
	public static void main(String[] args) {
		char[] key = "XNYAHPOGZQWBTSFLRCVMUEKJDI".toCharArray();
		String plain = "HelloWorld", str = "";//only aplha
		System.out.printf("Original text: %s\n", plain);
		for(char c : plain.toLowerCase().toCharArray()) {
			str += key[c - 97];
		}
		System.out.printf("Encoded text: %s\n", str);
		key = "dlryvohezxwptbgfjqnmuskaci".toCharArray();
		plain = "";
		for(char c : str.toCharArray()) {
			plain += key[c - 65];
		}
		System.out.printf("Decoded text: %s\n", plain);
	}
}