import java.util.Scanner;
class Main{
    static int mysqr(int m){
    int sum=0;
    for(int i=1;i<=m;i++)
    {
      sum=sum+i;
    }
    return sum;
  }
	public static void main (String[] args){
	    // Type your code here
     Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     System.out.println(mysqr(n));
	}
}