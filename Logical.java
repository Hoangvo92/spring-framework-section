public class Logical
{
       public static void main ( String args[])
       {
              boolean num1 = true, num2 = false;
              System.out.println("Result = " + ( 5> 3 && 3<5));
              System.out.println("Result = " + (num1 && num2));
              System.out.println("Result = " + (num1 || num2));
              System.out.println("Result = " + (!num2));
            //System.out.println("Result = " + (5 && 3)); // this is only true in C++ , not in Java. In C++, any # other than 0 is true, but in Java, that rule does not exist
        }
}