public class WithoutArgumentWithoutReturn
{
    public static void main(String args[])
     {
           hello();
           int a = numerical();
           System.out.println(a);
           printNumber(45);
     }

    // the hello() method must have 'static because
    // it is called within a static method
    static void hello()
    {
        System.out.println("Hello World!");
    }
    static int numerical()
    {
            return 50;
    }
    static void printNumber(int a)
    {
            System.out.println(a);
    }
}