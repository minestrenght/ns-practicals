public class Demo {
	public static void main(String[] args) {
		String plain = "hello";
        System.out.printf("Original text: %s\n", plain);
        char data[] = plain.toCharArray();
        int buf[] = new int[255];
        for(char i = 0; buf.length > i; i ++) buf[i] = i;
        String str = "";
        byte key[] = {1, 2, 3};
        for(int i = 0, j = 0; data.length > i; i ++) {
            j = (buf[i] + j + key[i % key.length] + 1) % 256;
            buf[i] = buf[i] + buf[j];
            buf[j] = buf[i] - buf[j];
            buf[i] = buf[i] - buf[j];
            str += (char)(buf[(buf[i] + buf[j]) % 256] ^ data[i]);
        }
        System.out.printf("Encoded text: %s\n", str);
	}
}