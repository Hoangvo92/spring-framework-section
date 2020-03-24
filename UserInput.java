import java.io.*;
publc class UserInput
{
    public static void main (String args[])
    {  
             InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr);
             try
              {
                System.out.println("Enter Name:");
                String name = br.readLine();
                System.out.println("Name you entered is: " + name);
               }
              catch (Exception e)
               {
                 System.out.println("Some Error");

                }
              try
               {
                 System.out.println("Enter first number: ");
                 int num1 = Integer.parseInt(br.readLine());
                 int num2 = Integer.parseInt(br.readLine());
                 System.out.println(num1 + num2);
                }
                catch (Exception e)
                {
               System.out.println("Some error!");
                }

    }
}






