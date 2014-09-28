import java.util.*;

public class caesar_cipher
{


 public caesar_cipher(String text)
 {
      String enText=caesarEn(text);
    System.out.println("Encrypted text : "+enText);
  System.out.println("Decrypted text : "+caesarDe(enText));
 }
 public String caesarEn(String text)
 {
  String enCaesar="";
  for(int i=0;i<text.length();i++)
  {
   int j=(int)(text.charAt(i));
   if(j==32)
    enCaesar=enCaesar+" ";
   else if(j==255)
    enCaesar=enCaesar+((char)(j-23));
       else
    enCaesar=enCaesar+((char)(j+3));
  }
    return enCaesar;
 }

        public String caesarDe(String text)
 {
  String deCaesar="";
  for(int i=0;i<text.length();i++)
  {
   int j=(int)text.charAt(i);
   if(j==32)
    deCaesar=deCaesar+" ";
   else if(j==232)
    deCaesar=deCaesar+((char)(j+23));

   /*else if(j>122)
    deCaesar=deCaesar+((char)(j+23));*/
       else
    deCaesar=deCaesar+((char)(j-3));
  }
    return deCaesar;
 }

 public static void main(String a[])
 {
  if(a.length<1)
  {
   System.out.println("Enter the Command Line Arguement");
   System.exit(0);
  }

  new caesar_cipher(a[0]);
 }


}