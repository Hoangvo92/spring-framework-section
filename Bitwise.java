public class Bitwise
{
     public static void main (String args[])
     {
          int num1 = 3, num2 = 2;
          System.out.println("Result = " + (num1 & num2)); //AND
          System.out.println("Result = " + (num1 | num2)); //OR
          System.out.println("Result = " + (num1 ^ num2)); //XOR
     }
}

/*
2 = 0010
3 = 0011
0010 & 0011 = 0010 -> 2
0010 | 0011 = 0011 -> 3
0010 ^ 0011 = 0001 -> 1

*/