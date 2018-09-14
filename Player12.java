/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Player12
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n;
     Scanner s=new Scanner(System.in);
     n=s.nextInt();
     int k=s.nextInt();
     ArrayList<Integer>a=new ArrayList<Integer>();
     for(int i=0;i<n;i++){
        int c=s.nextInt();
        a.add(c);
     }
     Collections.rotate(a,k );
     for(int d:a){
         System.out.printf("%d ", d);
     }
	}
}
