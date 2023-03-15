import java.util.Arrays;
import java.util.Scanner;
public class q6_2{
  public static void main(String[]args){
    double [] user = new double[10];
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter number of your order:");
    int order = sn.nextInt();
    System.out.print("Enter ten numbers:");
    for(int i = 0; i<10;i++){
      user[i] = sn.nextDouble();
    }
    Arrays.sort(user);
    for(int i = 0; i<10;i++){
      System.out.print(user[i]+" ");
    }
    System.out.print("\nYour number is "+user[10-order]);
  }
}
