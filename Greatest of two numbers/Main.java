import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int x,y,z;
      x = in.nextInt();
      y = in.nextInt();
      if(x>y)
        System.out.print("num1 is the greatest number");
      else 
        System.out.print("num2 is the greatest number");
     
	}
}