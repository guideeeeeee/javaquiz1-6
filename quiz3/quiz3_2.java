import java.util.Scanner;
public class quiz3_2{
  public static void main(String[]args){
    Scanner sn = new Scanner(System.in);
    int t=0,totalneg=0,totalodd=0;
    int ran,count=0;
    System.out.print("Enter number of rows(m):");
    int m = sn.nextInt();
    System.out.print("Enter number of columns(n):");
    int n = sn.nextInt();
    for(int i=0;i<m;i++){
      for(int j = 0;j<n;j++){
        ran =((int)(Math.random()*3000))-1750;
        System.out.printf("\t%d\t",ran);
        if(ran<0)
          totalneg++;
        if (ran%2!=0)
          totalodd++;
        if(ran<0 && ran%2!=0){
          t+=ran;
          count++;
        }
      }
      System.out.println();
    }
    System.out.printf("The total number of all negative numebrs is %d\n",totalneg);
    System.out.printf("The total number of all odd numebrs is %d\n",totalodd);
    System.out.printf("The total number of our numbers is %d\n",count);
    System.out.printf("The sum of our numbers in the %d x %d matrix is %d\n",m,n,t);
  }
}