import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int cd = 0;
    int x = n;
    while(n>0)
    {
      cd = cd + 1;
      n = n/10;
    }
    if ( cd == 5)
    {
      int d = x / 1000;
      int sd = d % 10;
      System.out.println(sd);
    }
    else
    {
      int sds = x % 10;
      System.out.println(sds);
    }
  }
}