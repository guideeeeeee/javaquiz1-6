import java.util.Scanner;
public class quiz3_1{
  public static void main (String[]args){
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter number (n): ");
    int n = sn.nextInt();
    double t=0;
    for(int i = 1;i<=n;i++){
      if(i%2 ==0 || i%7==0)
        t+=((double)(i/(i+2)))+((2*i)+2);
      if(i%40==0)
        System.out.printf("T = %.3f\n",t);
    }
  }
}