/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Moddiv
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	 int a;
	 int b;
	int y;
	char c;
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	c=s.next().charAt(0);
	b=s.nextInt();
	switch(c){
	 case '+':
            y=a+b;
           System.out.print(y);
           break;
           case '-':
            y=a-b;
           System.out.print(y);
           break;
           case '/':
            y=a/b;
           System.out.print(y);
           break;
           case '%':
           y=a%b;
           System.out.print(y);
           break;
           
   }

	}
}
