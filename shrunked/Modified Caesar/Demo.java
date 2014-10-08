public class Demo {
	public static void main(String[] args) throws Exception {
		String plain = "hello world", str = "";
        int shift = 3, ch, max = 256;
		System.out.printf("Original text: %s\n", plain);
		for(char c : plain.toCharArray()) {
            ch = (c + shift) % max;
			str += (char)ch;
		}
		System.out.printf("Encoded text: %s\n", str);
		plain = "";
		for(char c : str.toCharArray()) {
			ch = (c - shift) % max;
            if(0 > ch)
                ch += max;
            plain += (char)ch;
		}
		System.out.printf("Decoded text: %s\n", plain);
	}
}