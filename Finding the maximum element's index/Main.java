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
   
    int max_i=0;
    if(arr[0]>arr[1])
    {
      max_i=0;
    }     
    else
      max_i=1;
    for(int i=2;i<=size-1;i++)
    {
      if(arr[i]>arr[max_i])
      {
        arr[max_i]=arr[i];
        max_i=i;
      }
    }
    System.out.println(max_i);
  }
}