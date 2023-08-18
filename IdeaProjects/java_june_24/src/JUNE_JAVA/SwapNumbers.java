package JUNE_JAVA;

public class SwapNumbers {
    public static void main(String[] args)
    {
        int a=20;
        int b=10;
        System.out.println("value of a is:" +a);
        System.out.println("value of b is:" +b);
        System.out.println("after swapping ");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("the value of a is :" +a);
        System.out.println("the value of b is :" +b);

    }

}
