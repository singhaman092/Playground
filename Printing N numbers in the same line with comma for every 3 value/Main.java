import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
   Scanner com=new Scanner(System.in);
   int n=com.nextInt();
   for(int i=1;i<=n;i++)
   {
     System.out.print(i);
       if(i%3==0)
         System.out.print(",");
   }
  }
}