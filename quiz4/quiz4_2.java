public class quiz4_2{
  public static void main(String[]args){
    System.out.print("Fix volume = "+calVolume(2,0));
  }
  public static double calVolume(int b,int h ,int l){
    return (b*h*l)/2;
  }
  public static double calVolume(double r,double ch){
    return Math.PI*r*r*ch;
  }
  public static double calVolume(double sr){
    return ((double)4/3)*Math.PI*sr*sr*sr;
  }
}
