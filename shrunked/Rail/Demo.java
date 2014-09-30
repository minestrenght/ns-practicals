public class Demo {
	public static void main(String[] args) {
		String plain = "hello";
        System.out.printf("Original text: %s\n", plain);
        int rails = 3;//no. of rails
        char[] data = plain.toCharArray();
        char[][] fence = new char[rails][2 * (data.length / rails)];
		for(int i = 0, c = 0, t = 0; rails > i; i ++) {
            fence[i][c] = data[t ++];
            if(rails - 1 == i && data.length - 1 >= t) {
                c ++;
                for(int j = rails - 2; 0 <= j; j --) {
                    fence[j][c] = data[t ++];
                    if(0 == j && data.length - 1 >= t) {
                        c ++;
                        i = 0;
                    }
                }
            }
        }
        String str = "";
        for(char[] r: fence) {
            str += new String(r);
        }
        System.out.printf("Encoded text: %s\n", str);
	}
}