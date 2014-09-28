import java.io.*;
import java.io.BufferedReader;
//import java.util.*;
public class Mono_alpha
{
  public static void main(String args[]) throws IOException
   {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
// for Encryption
//char[] key3={'d','i','r','y','v','o','h','e','z','x','w','p','t','b','g','f','j','q','n','m','u','s','k','a','c','i'};
char[] key1= {'X','N','Y','A','H','P','O','G','Z','Q','W','B','T','S','F','L','R','C','V','M','U','E','K','J','D','I'};
String ciphertext=""; 
System.out.print("Enter PlainText ");
String plaintext = br.readLine();
//String plaintext ="JK";
plaintext= plaintext.toLowerCase();
int i;
for(i=0;i<plaintext.length();i++)
{
    int asci_plaintext = plaintext.charAt(i);
    asci_plaintext= asci_plaintext-97;
    char c=key1[asci_plaintext];
    ciphertext=ciphertext+c;
}
System.out.println("CipherText is = " +ciphertext);



// for Decryption
char[] key2={'d','l','r','y','v','o','h','e','z','x','w','p','t','b','g','f','j','q','n','m','u','s','k','a','c','i'};
  plaintext="";
  
  for(int j=0; j<ciphertext.length();j++)
  {
     
      int ascii_ciphertext = ciphertext.charAt(j);
      ascii_ciphertext=ascii_ciphertext-65;
      char c= key2[ascii_ciphertext];
      plaintext+=c;
     
  }
   System.out.println("Plaintext is="+plaintext);
     
  }  
}

  