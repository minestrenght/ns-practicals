public class Demo {
	public static void main(String[] args) {
        String plain = "hello", key = "123";
        System.out.printf("Original text: %s\n", plain);
        int kl = key.length(), pl = plain.length();
        String cKey = key;
        for(int i = 1, qst = pl / kl; qst > i; i ++)
            key += cKey;
        key += key.substring(0, pl % kl);
        String str = "", buf = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; pl > i; i ++)
            str += buf.charAt((buf.indexOf(key.charAt(i)) 
                        + buf.indexOf(plain.charAt(i))) % 26);
        System.out.printf("Encoded text: %s\n", str.toUpperCase());
        plain = "";
        for(int i = 0; pl > i; i ++)
            plain += buf.charAt(buf.indexOf(str.charAt(i))
                        - buf.indexOf(key.charAt(i)));
        System.out.printf("Decoded text: %s\n", plain);
	}
}