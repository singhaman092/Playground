import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int x = in.nextInt();
      int fd = x / 100;
      int td = x % 10;
      int sum = fd + td;
      System.out.println(sum);
	}
}