import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sq = sqr(n);
      System.out.println(sq);
	} 
  public static int sqr(int m)
  {
    int x = m * m;
    return x;
  }
}