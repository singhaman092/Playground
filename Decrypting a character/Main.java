import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      char ch = in.next().charAt(0);
      int key = in.nextInt();
      
      int offset = 0;
      if (Character.isUpperCase(ch)) {
        offset = ch - 'A';
        if (key>offset) ch = (char)(90-key+offset+1);
        else ch = (char)(ch - key);
      } else {
        offset = ch - 'a';
        if (key>offset) ch = (char)(122-key+offset+1);
        else ch = (char)(ch - key);
      }
      System.out.println(ch);
    }
}