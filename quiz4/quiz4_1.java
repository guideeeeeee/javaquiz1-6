import java.util.Scanner;
public class quiz4_1{
  public static void main(String[]args){
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter value of width:");
    double w = sn.nextDouble();
    System.out.print("Enter value of length:");
    double l = sn.nextDouble();
    System.out.print("Enter inner depth:");
    double id = sn.nextDouble();
    System.out.print("Enter outer depth:");
    double od = sn.nextDouble();
    System.out.printf("The different volume of 2 Rectangle Boxes is: %.1f",rectangleBoxVolumeDif(w,l,od,id));
  }
  public static double rectangleBoxVolumeDif(double length,double width,double deptOut,double deptIn){
    return (length*width*deptOut) - (length*width*deptIn);
  }
}
