/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Palindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n,sum=0,res;
		  while(n>0)
		  {    
   res=n%10;  //getting remainder  
   sum=(sum*10)+res;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("yes");    
  else    
   System.out.println("no");    
}  
}  
