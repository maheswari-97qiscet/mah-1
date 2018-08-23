/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RevAndEleVowel
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1="",s2;
		for(int i=0;i<s.length();i++)
		{
			s1=s.charAt(i)+s1;
		}
	
		s2=s1.replaceAll("[aeiouAEIOU]","");
		System.out.print(s2);

	}
}
