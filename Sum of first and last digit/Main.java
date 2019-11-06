import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int x = in.nextInt();
      int y = x;
      int cd = 0;
      while(x>0)
      {
        cd = cd + 1;
        x= x/10;
      }
      if (cd == 5)
      {
          int fd = y / 10000;
        int ld = y % 10;
        int sum = fd + ld;
        System.out.println(sum);
      }
      else
      {
        int fds = y / 1000;
        int lds = y % 10;
        int sums = fds + lds;
        System.out.println(sums);
      }
	}
}