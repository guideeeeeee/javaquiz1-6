import java.util.Scanner;
public class quiz2_2{
  public static void main(String[]args){
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter r1's center x,y-coordinates, width, and height :");
    int x1 = sn.nextInt();
    int y1 = sn.nextInt();
    double w1 = sn.nextDouble();
    double h1 = sn.nextDouble();
    System.out.print("Enter r2's center x,y-coordinates, width, and height :");
    int x2 = sn.nextInt();
    int y2 = sn.nextInt();
    double w2 = sn.nextDouble();
    double h2 = sn.nextDouble();
    if(x1-(w1*0.5))>=(x2-(w2*0.5)){
    }    
  }
}
