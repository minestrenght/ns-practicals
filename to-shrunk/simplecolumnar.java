import java.io.*;
 import java.math.*;
 class simplecolumnar {
     public static void main(String[]args)throws IOException
     {
         String plaintext,ciphertext="",temp="";
   	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int i=0,j=0;
        System.out.print("Enter plain text:");
        plaintext= br.readLine();
        int plen=plaintext.length();
        for(i=0;i<plen;i++)
        {
            if(plaintext.charAt(i)==' ')
                { continue;
		}
		else
		{temp+=plaintext.charAt(i);}

        }
        System.out.print("temp ="+temp);
        int len=temp.length();
        System.out.print("Enter No. of columns(max."+len+"):");
      int cols=Integer.parseInt(br.readLine());

        if(len>=cols)
        {
            int rows=1,k=0;

               rows=(len/cols)+1;

            char matrix [][]=new char [rows][cols];
            for(i=0;i<rows;i++)
            {
                for(j=0;(j<cols)&&(k<len);j++)
                {
		    
                     matrix[i][j]= temp.charAt(k);

                    k++;
                }

            }
             i--;
            for(;j<cols;j++)
            {
                
		
                for(i=0; i<rows;i++)
                {
                    for(j=0;j<cols;j++)
                    {
                        System.out.print(matrix[i][j]+"");

                    }
                    System.out.println();

                }
               System.out.println();
               int encol[]=new int[cols];
               for(i=0;i<cols;i++)
               {
                   System.out.println("Enter column no."+(i+1)+":");
                   encol[i]=Integer.parseInt(br.readLine())-1;

               }
               if(encol.length==cols)
               {
                   for(i=0;i<cols;i++)
                   {
                       for(j=0;j<rows;j++)
                       {
                           if(matrix[j][encol[i]]!=' ')
				ciphertext+=matrix[j][encol[i]];
                       }
                   }
               }

               temp="";
               for(i=0;i<ciphertext.length();i++)
                   // if(ciphertext.charAt(i)!='$')
                       temp+=ciphertext.charAt(i);
               ciphertext=temp;
               System.out.println("ciphertext :"+ciphertext);

            }}
            else
                System.out.println("incorrect no.of columns!!!");
        

     }

}
