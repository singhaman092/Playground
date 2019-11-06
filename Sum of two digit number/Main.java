import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int x = in.nextInt();
      int sd = x % 10;
      int fd = x / 10;
      int sum = sd + fd;
      System.out.println(sum);
	}
}