
class Generic1
{
    public static <T> void Display(T Arr[])
    {
      for(T no : Arr) //foreach
     {
        System.out.println(no);
     }

    /* for(int i = 0; i < Arr.length; i++)
     {
        System.out.println(Arr[i]);
     }*/
    }

    public static void main(string Arg[])
    {
        Integer A[] = {1,20,30,40};
        Float B[] = {50f,89f,60f,90f,70f,88f};
        Double C[] = {50.45,60.44,70.56};

        Display(A);
        Display(B);
        Display(C);
    }
}