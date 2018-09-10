/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Player8
{
	public static void main (String[] args) throws java.lang.Exception
	{
				Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String result = "";
    char firstChar = input.charAt(0);
    result = result + Character.toUpperCase(firstChar);
    for (int i = 1; i < input.length(); i++) {
    char currentChar = input.charAt(i);
    char previousChar = input.charAt(i - 1);
    if (previousChar == ' ')
    {
      result = result + Character.toUpperCase(currentChar);
    } 
    else 
    {
      result = result + currentChar;
    }
    }
    System.out.println(result);

	}
}
