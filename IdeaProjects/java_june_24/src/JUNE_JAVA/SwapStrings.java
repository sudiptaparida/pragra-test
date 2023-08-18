package JUNE_JAVA;

public class SwapStrings {
    public static void main(String[] args)
    {
        String s1="hello";
        String s2="world";
        System.out.println(" before swap s1 is :" +s1);
        System.out.println("before swap s2 is :" +s2);
        System.out.println ();
        System.out.println();

        s1=s1+s2; //append s1 and s2
       // s2=s1-s2;
      //  s1=s1-s2;
       //
      s2=s1.substring(0,s1.length()-s2.length()); //store initial string s1 in s2
      s1=s1.substring(s2.length()); //store initial string s2 in s1
        System.out.println("after swap the value of s1 is :" +s1);
         System.out.println("after swap the value of s2 is :" +s2);


    }


}
