class Demo {
	public static void main(String[] args) {
		char[] plain = "aBc DEf $ 123".toCharArray();
		int i = 0, shift = 3, max = 256;
		char[] encode = new char[plain.length];
        char val;
		for(char c : plain) {
            val = (char)((c + shift)%max);
            if(' ' != c && max >= val) {
                encode[i ++] = val;
            } else {
                encode[i ++] = c;
            }
		}
		System.out.printf("plain=%s, encode=%s\n", new String(plain), new String(encode));
		char[] decode = "dEf#GHi".toCharArray();
		plain = new char[decode.length];
		i = 0;
		for(char c : decode) {
			val = (char)((c - shift)%max);
            if(' ' != c && max >= val) {
                plain[i ++] = val;
            } else {
                plain[i ++] = c;
            }
		}
		System.out.printf("decode=%s, plain=%s\n", new String(decode), new String(plain));
	}
}