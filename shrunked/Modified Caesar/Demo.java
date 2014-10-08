public class Demo {
	public static void main(String[] args) throws Exception {
		String plain = "hello", alpha = "abcdefghijklmnopqrstuvwxyz", str = "";
        int shift = 4, ch, max = alpha.length();
		System.out.printf("Original text: %s\n", plain);
		for(char c : plain.toCharArray()) {
            ch = (shift + alpha.indexOf(c)) % max;
			str += alpha.charAt(ch);
		}
		System.out.printf("Encoded text: %s\n", str);
		plain = "";
		for(char c : str.toCharArray()) {
			ch = (alpha.indexOf(c) - shift) % max;
            if(0 > ch)
                ch += max;
            plain += alpha.charAt(ch);
		}
		System.out.printf("Decoded text: %s\n", plain);
	}
}