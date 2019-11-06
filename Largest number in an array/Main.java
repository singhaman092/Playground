import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
     Scanner large=new Scanner(System.in);
     int size=large.nextInt();
     int arr[]=new int[size];
     for(int i=0;i<=size-1;i++)
     {
       arr[i]=large.nextInt();
     }
     int max_no=0;
     if(arr[0]>arr[1])
     {
       max_no=arr[0];
     }
     if(arr[1]>arr[0])
     {
       max_no=arr[1];
     }
     for(int i=1;i<=size-1;i++)
     {
       if(arr[i]>max_no)
       {
         max_no=arr[i];
       }
     }
      System.out.println(max_no);
    }
}