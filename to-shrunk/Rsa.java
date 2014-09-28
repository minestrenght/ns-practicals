import java.math.BigInteger;
import java.security.SecureRandom;
public class Rsa {

    private BigInteger n,d,e,ret;

    public Rsa(String str)
            {
            SecureRandom r = new SecureRandom();
            BigInteger p = new BigInteger("17");
            BigInteger q = new BigInteger("11");

            n = p.multiply(q);
            BigInteger m =
(p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));

            e = new BigInteger("7");

            while(m.gcd(e).intValue()>1)
                e = e.add(new BigInteger("2"));

            d = e.modInverse(m);

            System.out.println("p = "+p+", q = "+q);
            System.out.println("N = p*q = "+n);
            System.out.println("m = (p-1)*(q-1) = "+m);
            System.out.println("e = "+e);
            System.out.println("d = (1+(n1*m))/e = "+d);
            System.out.println("Public Key :("+n+","+e+")");
            System.out.println("Private Key :("+n+","+d+")");

            ret = encrypt(new BigInteger(str));

            decrypt(ret);
            }
    public BigInteger encrypt(BigInteger message)
    {
    System.out.println("Encrypted message/Cipher Text:"+message.modPow(e, n));

    return message.modPow(e, n);

    }

    public BigInteger decrypt(BigInteger message)
    {
    System.out.println("Decrypted message/Original
Number:"+message.modPow(d, n));

    return message.modPow(d, n);

    }
    public static void main(String[] a) {
        // TODO code application logic here
        if(a.length<1)
        {
        System.out.println("Enter the command line argument.");
        System.exit(0);
        }
        new Rsa(a[0]);
    }
}

