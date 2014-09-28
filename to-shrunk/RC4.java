import java.io.*;

class RC4{

String plaintext;
static char cipher[];

	RC4(String plaintext,int []key)	
	{
		this.plaintext = plaintext;
		int s[] = new int [255];
		cipher = new char[plaintext.length()];
		for(int i=0;i<s.length;i++)
		{
		s[i]=i;
		}
		
		int i=0;
		int j=0;
		for(int k = 0; k<plaintext.length();k++)
		{

		int modk = (k%key.length);
		int kc = key[modk];
		j=(s[i]+j+kc)%256+1;
		int temp = s[i];
		s[i] = s[j];
		s[j] = temp;
		int sc = (s[i]+s[j])%256;
		int ck = s[sc];
		cipher[k]=(char)(ck^(int)plaintext.charAt(k));
		i=i+1;
		}
	}

	public static void main(String [] args)
	{
	int k[]={1,2,3,4,5};
	String original_msg = "Hello Avinash";
	System.out.println("ORIGINAL STRING:"+original_msg);
	new RC4(original_msg,k);
	System.out.println("\nCIPHER TEXT:");
	
	for(int i=0;i<cipher.length;i++)
	{
	System.out.print(""+cipher[i]);
	}
	}
}