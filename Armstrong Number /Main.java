import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp = n;
      int temp1=n;
      int pd,cd=0;
      int sum = 0;
      while(n > 0)
      {
        cd=cd+1;
        n=n/10;
      }
      while(temp>0)
      {
        pd=temp%10;
        int prod = 1;
        for(int i =1;i<=cd;i++)
        {
          prod = pd * prod; 
        }
        sum = sum + prod;
        temp=temp/10;
      }
   
      if(temp1==sum)
        
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
    }
}