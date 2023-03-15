import java.util.Scanner;
public class quiz2_1{
  public static void main(String[]args){
    Scanner sn = new Scanner(System.in);
    System.out.print("Please enter input (A-Z):");
    char input = sn.next().charAt(0);
    switch(input){
      case 'C':
        System.out.print("This Character is in the Abbreviation of Computer Engineering SWU");
        break;
      case 'P':
        System.out.print("This Character is in the Abbreviation of Computer Engineering SWU");
        break;
      case 'E':
        System.out.print("This Character is in the Abbreviation of Computer Engineering SWU");
        break;
      case 'S':
        System.out.print("This Character is in the Abbreviation of Computer Engineering SWU");
        break;
      case 'W':
        System.out.print("This Character is in the Abbreviation of Computer Engineering SWU");
        break;
      case 'U':
        System.out.print("This Character is in the Abbreviation of Computer Engineering SWU");
        break;
      default:
        System.out.print("This Character is not in the Abbreviation of Computer Engineering SWU");
    }
  }
}