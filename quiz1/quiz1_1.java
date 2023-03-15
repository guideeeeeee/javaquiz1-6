import java.util.Scanner;
public class quiz1_1{
  public static void main(String[]args){
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter the number of hours:");
    int hr = sn.nextInt();
    int day = hr/24;
    int year = day/365;
    System.out.println(hr+" hours is approximately "+year+" years, "+day%365+" days and "+hr%24+" hours");
  }
}