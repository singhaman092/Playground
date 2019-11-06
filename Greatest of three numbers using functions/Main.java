import java.util.Scanner;
class Main{
  static int big(int n1,int n2,int n3){
    int max_no=0;
    if(n1>n2)
    {
      if(n1>n3)
      {
        max_no=n1;
      }
    }
    else if(n2>n1)
     {
      if(n2>n3)
      {
       max_no=n2;
    }
       else
         max_no=n3;
  }
    return max_no;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int m1=in.nextInt();
      int m2=in.nextInt();
      int m3=in.nextInt();
      int bag=big(m1,m2,m3);
      System.out.println(bag);
	}
}