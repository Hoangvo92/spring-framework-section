public class OverloadingOfMain
{
    public static void main(String args[])
    {
        main(3);
        main( );
        main(3.5);
        main(78.9);
        main(true);
        main(false);
     }
     static void main(int a)
     {
         System.out.println(a);
     }
     
     static void main()
     {
         System.out.println("Blank!");
      }
     static void main(double f)
     {  
         System.out.println(f);
     }
     static void main(boolean answer)
     {
        if (answer == true)
         {
            System.out.println("Hanyan! Angel Sakura-chan is here for you!");
         }
        else
         {
            System.out.println("Devil Boss Touya will kick you away!");
         }
      }
}

/*
static function cannot exercise non-static functions of class
-> all overloaded mains have static
*/