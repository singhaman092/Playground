import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int len;
      len = in.nextInt();
      int bre = in.nextInt();
      int area = len * bre;
      System.out.println(area);
	}
}