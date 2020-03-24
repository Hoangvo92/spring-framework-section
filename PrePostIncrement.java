/*
Unary Artithmetic Operator:

               Pre And Post Increment (++)
               Pre and Post Decrement (--)
*/

public class PrePostIncrement
{
         public static void main (String args[])
         {
               int a = 5;
               int b = a;
               int c = ++ a;
               System.out.println(a);
               System.out.println(b);
               System.out.println(c);
          }
}

/*

c= ++a;
-> c = 6 during printing of the main
c = a ++;
-> c= 5 during printing of the main

*/