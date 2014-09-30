import java.math.BigInteger;
public class Demo {
	public static void main(String[] args) {
		BigInteger o = new BigInteger("5");
        System.out.printf("Original text: %s\n", o);
        BigInteger p = new BigInteger("17");
        BigInteger q = new BigInteger("11");
        BigInteger n = p.multiply(q);
        BigInteger m = p.subtract(BigInteger.ONE)
                        .multiply(q.subtract(BigInteger.ONE));
        BigInteger e = new BigInteger("7");
        while(1 < m.gcd(e).intValue())
            e = e.add(BigInteger.ONE);
        BigInteger r = o.modPow(e, n);
        System.out.printf("Encoded text: %s\n", r);
        r = r.modPow(e.modInverse(m), n);
        System.out.printf("Decoded text: %s\n", r);
	}
}