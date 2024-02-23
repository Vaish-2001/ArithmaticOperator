class ArithmaticOperation

{
 public static void main(String[]args)
  {
   int a=30;
   int b=50;

   System.out.println(a+b);  //a=b=80
   System.out.println(a-b);  //a-b=-20
   System.out.println(a*b);  //a*b=1500
   System.out.println(b/a);  //b/a=1
   System.out.println(b%a);  //b%a=20
   System.out.println(a/b);  //a/b=0
   System.out.println(a%b);  //a%b=30,because 50 is not divided by 30
   System.out.println(a>b);  //false
   }
}