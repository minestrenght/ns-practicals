class Demo {
	public static void main(String[] args) {
        int shift = 3, mod = 26, i;
        String actual = "";
        String shifted = "";
        for(char a = 'a', s = (char)(a + shift); 'z' >= a; a ++, s = (char)(a + shift)) {
            if('z' < s) {
                s -= 26;
            }
            actual += a;
            shifted += s;
        }

        String plain = "Hello World !";
        String encode = "";
        for(char c : plain.toLowerCase().toCharArray()) {
            i = actual.indexOf(c);
            encode += (-1 != i ? shifted.charAt(i) : c);
        }
        System.out.printf("plain[%s], encode[%s]\n", plain, encode);

        String decode = "";
        for(char c : encode.toLowerCase().toCharArray()) {
            i = shifted.indexOf(c);
            decode += (-1 != i ? actual.charAt(i) : c);
        }
        System.out.printf("encode[%s], decode[%s]\n", encode, decode);
	}
}