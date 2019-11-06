import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner joe= new Scanner(System.in);
      int n= joe.nextInt();
      int cd=0;
      int temp=n;
      int digit;
      int sum=0;
      while(n>0)
      {
        int prod=1;
        digit = n % 10;
        for(int i =1;i<=digit;i++)
        {
          prod = prod * i;
        }
        //System.out.println(prod);
        sum = sum+prod;
        n = n/10;
	  }
      if(temp==sum)
      {
        System.out.println("Yes");
      //System.out.println(sum);
      }
      else
      {
        System.out.println("No");
       // System.out.println(sum);
      }
    }
}