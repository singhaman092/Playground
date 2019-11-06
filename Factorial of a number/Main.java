import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner find= new Scanner(System.in);
      int n= find.nextInt();
      int pro=1;
      for(int i=1;i<=n;i++)
      {
        pro=i*pro;
	}
      System.out.println(pro);
}
}