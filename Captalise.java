/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Captalise
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		    String a;
    int d;
    Scanner s=new Scanner(System.in);
    a=s.nextLine();
    String h[]=a.split("\\s+");
    for(int i=0;i<h.length;i++){
        char c=h[i].charAt(0);
        char t=Character.toUpperCase(c);
        h[i]=h[i].replace(c, t);
    }
    for(String j:h){
        System.out.printf("%s ", j);
    }

	}
}
