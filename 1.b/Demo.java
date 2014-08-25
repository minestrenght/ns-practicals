class Demo {
	public static void main(String[] args) {
		char[] plain = "aBc".toLowerCase().toCharArray();
		int i = 0, shift = 3;
		char[] encode = new char[plain.length];
		for(char c : plain) {
			encode[i ++] = (char)(c + shift);
		}
		System.out.printf("plain=%s, encode=%s\n", new String(plain), new String(encode));
		char[] decode = "DEf".toLowerCase().toCharArray();
		plain = new char[decode.length];
		i = 0;
		for(char c : decode) {
			plain[i ++] = (char)(c - shift);
		}
		System.out.printf("decode=%s, plain=%s\n", new String(decode), new String(plain));
	}
}