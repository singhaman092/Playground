import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int arr[]=new int[size];
    for(int i=0;i<=size-1;i++)
    {
      arr[i]=sc.nextInt();
    }
    boolean flag=true;
    int prev_sum=0;
    int sum=0;
    prev_sum=arr[0]+arr[1]+arr[2];
    for(int i=3;i<=size-1;i=i+3)
    {
      sum=arr[i]+arr[i+1]+arr[i+2];
      if(prev_sum!=sum)
      {
        flag=false;
      }
      else 
        flag=true;
    }
    if(flag==true)
    {
      System.out.println("Perfect Batch");
    }
    else
      System.out.println("Not a Perfect Batch");
  }
}