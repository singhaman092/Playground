import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<=size-1;i++)
      {
        arr[i]=sc.nextInt();
      }
      int value=sc.nextInt();
      for(int i=0;i<=size-1;i++)
      {
        for(int j=i+1;j<=size-1;j++)
        {
          if(arr[i]+arr[j]==value)
          {
            System.out.println(arr[i]+", "+arr[j]);
          }
        }
      }
    }
}