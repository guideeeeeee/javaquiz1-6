public class Cylinder{
  public final double Pi = 3.14;
  private double radius,height;
  public Cylinder(){
    this.radius = 5;
    this.height = 5;
  }
  public Cylinder(double r){
    this.radius = r;
    this.height = 5;
  }
  public Cylinder(double r,double h){
    this.radius = r;
    this.height = h;
  }
  public double getCircleArea(){
    return Pi*radius*radius;
  }
  public double getCylinderVolume(){
    return Pi*radius*radius*height;
  }
  public double getSurfaceAreaAllSides(){
    return 2*Pi*radius*(radius+height);
  }
  public double getRadius(){
    return radius;
  }
  public double getHeight(){
    return height;
  }
  public void printCylinder(){
    System.out.println("All parameters of this Cylinder");
    System.out.println("Radius = "+getRadius()+" cm, Height = "+getHeight()+" cm");
    System.out.println("Circle Area = "+getCircleArea()+" cm2");
    System.out.println("Surface Area of All Sides = "+getSurfaceAreaAllSides()+" cm2");
    System.out.println("Volume of Cylinder = "+getCylinderVolume()+" cm3");
    System.out.println();
  }
}

