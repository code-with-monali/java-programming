import java.util.Scanner;

class Exception
{
    public static void main(String [Arg])
    {
        Scanner sobj = new Scanner(System.in);
        int No1 = 0, No2 = 0;
        float Ans = 0.0f;

        System.out.println("Enter first number :");
        No1 = sobj.nextInt();

        System.out.println("Enter second number :");
        No2 = sobj.nextInt();
try {
        Ans = No1/No2;
}
catch(ArithmeticException obj)
{
    System.out.println("Exception occured & code is inside catch block : "+obj);

}

        System.out.println("Division is : "+Ans)

    }
}