import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int a,b,c;
      a = in.nextInt();
      b = in.nextInt();
      c = in.nextInt();;
      if(a>b && a>c)
      {  
        System.out.print(a);
      }
      if(b>a && b>c)
      {
        System.out.print(b);
      }
      if(c>a && c>b)
        System.out.print(c);
    }
}