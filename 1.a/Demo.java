class Demo {
	public static void main(String[] args) {
		char[] plain = "aBc DEf".toCharArray();
		int i = 0, shift = 3;
		char[] encode = new char[plain.length];
        char val;
		for(char c : plain) {
            val = (char)(c + shift);
            if(('A' <= val && 'Z' >= val) || ('a' <= val && 'z' >= val)) {
                encode[i ++] = val;
            } else {
                encode[i ++] = c;
            }
		}
		System.out.printf("plain=%s, encode=%s\n", new String(plain), new String(encode));
		char[] decode = "dEf GHi".toCharArray();
		plain = new char[decode.length];
		i = 0;
		for(char c : decode) {
			val = (char)(c - shift);
            if(('A' <= val && 'Z' >= val) || ('a' <= val && 'z' >= val)) {
                plain[i ++] = val;
            } else {
                plain[i ++] = c;
            }
		}
		System.out.printf("decode=%s, plain=%s\n", new String(decode), new String(plain));
	}
}