import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int size=in.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<=size-1;i++)
      {
        arr[i]=in.nextInt();
      }
      int search_ele_1=in.nextInt();
      int search_ele_2=in.nextInt();
      int index_1=-1;
      int index_2=-1;
      for(int i=0;i<=size-1;i++)
      {
        if(arr[i]==search_ele_1)
        {
          index_1 = i;
        }
        else if(arr[i]==search_ele_2)
        {
          index_2 = i;
        }
      }
      System.out.println(index_1);
      System.out.println(index_2);
    }
}