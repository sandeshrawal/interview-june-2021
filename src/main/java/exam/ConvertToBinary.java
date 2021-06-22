package exam;
import java.util.*;
import java.util.Scanner;
public class IntegerToBinary
{
   public static void main(String[] args)
   {
      int num;
      String str = "";
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter the a number : ");
      num = sc.nextInt();
      // convert int to binary java
      while(num > 0)
      {
         int y = num % 2;
         str = y + str;
         num = num / 2;
      }
      System.out.println("The binary conversion is : " + str);
      sc.close();
   }
}
