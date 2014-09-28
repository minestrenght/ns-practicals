public class Demo {
	public static void main(String[] args) {
		double p1 = 3.0, p2 = 7.0;//prime nos, public
		double x = 6.0, y = 8.0;//random values, private
		double s1 = Math.pow(p1, x) % p2;
		double s2 = Math.pow(p1, y) % p2;
		s2 = Math.pow(s2, x) % p2;
		s1 = Math.pow(s1, y) % p2;
		System.out.printf("Shared symmetric key test: %s\n", (s1 == s2 ? "Pass" : "Fail"));
	}
}