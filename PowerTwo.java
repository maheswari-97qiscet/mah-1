/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PowerTwo
{
	public static void main (String[] args) throws java.lang.Exception{
    Scanner in = new Scanner(System.in);
    int number = in.nextInt();
    in.close();

    if (isPowerOfTwo(number)) {
      System.out.println("yes");
    } else {
      System.out.printf("no");
    }
  }

  private static boolean isPowerOfTwo(int number) {

    if (number % 2 != 0) {
      return false;
    } else {

      for (int i = 0; i <= number; i++) {

        if (Math.pow(2, i) == number) return true;
      }
    }
    return false;
  }
}
	
