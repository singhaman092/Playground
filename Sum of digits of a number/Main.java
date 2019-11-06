import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int x = in.nextInt();
      int y = x;
      int sum = 0;
      while(x>0)
      {
        int z = x % 10;
        sum = sum + z;
        x = x / 10;
      }
      System.out.println(sum);
        
	}
}