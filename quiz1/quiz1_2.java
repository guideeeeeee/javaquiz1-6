import javax.swing.JOptionPane;
public class quiz1_2{
  public static void main(String[]args){
    String user = JOptionPane.showInputDialog("Enter the side(s):");
    double s = Double.parseDouble(user);
    double area = ((3*1.732)/2)*s*s;
    JOptionPane.showMessageDialog(null, "The area of the hexagon is " +area);
    
  } 
}