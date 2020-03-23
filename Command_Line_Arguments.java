/*
Command line arguments:
                Are the values which are given at run time.
                The value is stored in the string array (Argument of Main)
                THe command line Arguments passed at run time
*/

public class Command_Line_Arguments
{
       public static void main( String args[])
       {
            System.out.println(args[0]);
            System.out.println(args[1]);
       }
}

/*
Run File

javac Command_Line_Arguments.java
java Command_Line_Arguments "Sakura" "20 years old"

Error situation:
D:\java>java Command_Line_Arguments "Sakura"
Sakura
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1
        at Command_Line_Arguments.main(Command_Line_Arguments.java:13)


All args type values are strings, never numerical despite the values:
   For example:
       System.out.println(args[0] + args[1])
       java Command_Line_Arguments 5 3
       result: 53, not 8=5+3
*/