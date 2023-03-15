import java.util.Scanner;
public class q2_2edit{
  public static void main (String[]args){
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter r1's center x,y - coordinates, width, and height:");
    int x1 = sn.nextInt();
    int y1 = sn.nextInt();
    double w1 = sn.nextDouble();
    double h1 = sn.nextDouble();
    
    double l1 = x1-(w1/2);
    double r1 = x1+(w1/2);
    double t1 = y1+(h1/2);
    double b1 = y1-(h1/2);
    
    System.out.print("Enter r2's center x,y - coordinates, width, and height:");
    int x2 = sn.nextInt();
    int y2 = sn.nextInt();
    double w2 = sn.nextDouble();
    double h2 = sn.nextDouble();
    
    double l2 = x2-(w2/2);
    double r2 = x2+(w2/2);
    double t2 = y2+(h2/2);
    double b2 = y2-(h2/2);
    
    if((l1<=l2 && r1>=r2) && (t1>=t2 && b1<=b2))
      System.out.print("r2 is inside r1");
    else if ((r1<=l2 || l1>=r2) || (t1<=b2 || b1>=t2))
      System.out.print("r2 does not overlap r1");
    else //((l1<=l2 || r1>=r2) || (t1>=t2 || b1<=b2))
      System.out.print("r2 overlaps r1");
    
    
  }
}