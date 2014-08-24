class Demo {
	public static void main(String[] args) {
		String letters = "abcdefghijklmnopqrstuvwxyz";
		char[] plain = "aBc".toLowerCase().toCharArray();
		int i = 0, shift = 3;
		int pos, val, len = letters.length();
		char[] encode = new char[plain.length];
		for(char c : plain) {
			pos = letters.indexOf(c);
			val = (shift + pos) % len;
			encode[i ++] = letters.charAt(val);
		}
		System.out.printf("plain=%s, encoded=%s\n", new String(plain), new String(encode));
		char[] decode = "DEf".toLowerCase().toCharArray();
		plain = new char[decode.length];
		i = 0;
		for(char c : decode) {
			pos = letters.indexOf(c);
			val = (pos - shift) % len;
			if(0 > val) {
				val += len;
			}
			plain[i ++] = letters.charAt(val);
		}
		System.out.printf("decode=%s, plain=%s\n", new String(decode), new String(plain));
	}
}