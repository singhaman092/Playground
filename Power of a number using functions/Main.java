import java.util.Scanner;
class Main{
  static int mysqr(int b,int e){
  int result=1;
  while(e!=0)
    {
    result=result*b;
    e--;
    }
    return result;
  }
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int base=in.nextInt();
    int exp=in.nextInt();
    int power=mysqr(base,exp);
    System.out.println(power);
  }
}