// Program to encrypt and decrypt plain text using AES Encryption

import java.security.*;
import javax.crypto.*;
import java.io.*;

public class AESStringEncrypter
{
	Cipher enCipher;
	Cipher deCipher;

	public AESStringEncrypter(SecretKey key)
	{
		try
		{
			enCipher = Cipher.getInstance("AES");
			deCipher = Cipher.getInstance("AES");

			enCipher.init(Cipher.ENCRYPT_MODE, key);
			deCipher.init(Cipher.DECRYPT_MODE, key);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public String encrypt(String str)
	{
		try
		{
			byte utf8[] = str.getBytes("UTF8");
			byte en[] = enCipher.doFinal(utf8);

			return new sun.misc.BASE64Encoder().encode(en);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		return null;
	}

	public String decrypt(String str)
	{
		try
		{
			byte de[] = new sun.misc.BASE64Decoder().decodeBuffer(str);
			byte utf8[] = deCipher.doFinal(de);

			return new String(utf8, "UTF8");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		return null;
	}

	public static void main(String a[])
	{
		if(a.length < 1)
		{
			System.out.println("Enter the command line argument.");
			System.exit(0);
		}

		SecretKey key = null;

		try
		{
			KeyGenerator keyGen = KeyGenerator.getInstance("AES");
			key = keyGen.generateKey();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		AESStringEncrypter dese = new AESStringEncrypter(key);

		String ar = a[0];
		String en = dese.encrypt(ar);
		String de = dese.decrypt(en);

		System.out.println("Original Text : " + ar);
		System.out.println("Encrypted Text : " + en);
		System.out.println("Decrypted Text : " + de);
	}
}
