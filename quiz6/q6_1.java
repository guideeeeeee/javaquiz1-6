import java.util.Scanner;
public class q6_1{
  public static void main(String[]args){
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter the number of rows and column of the array:");
    int size = sn.nextInt();
    int [][] array = new int[size][size];
    for(int i = 0; i<size;i++){
      for(int j = 0; j<size;j++){
      int random = ((int)(Math.random()*100));
        array[i][j]=random;
    }
    }
    System.out.print("Initailze random matrix:\n");
    for(int i = 0; i<size;i++){
      for(int j = 0; j<size;j++){
      System.out.print(array[i][j]+"\t");
    }
      System.out.println();
    }
    show49Sharp(array);
  }
  
  public static void show49Sharp(int[][] matrix){
    System.out.print("\nResult matrix\n");
    for(int i = 0;i<matrix.length;i++){
      for(int j = 0;j<matrix.length;j++){
        if(j%3 == 0){
          if(matrix[i][j]%10 == 4 || matrix[i][j]%10 == 9)
            System.out.print(matrix[i][j]+"\t");
          else
            System.out.print("#\t");
        }
        else
          System.out.print(matrix[i][j]+"\t");
    }
      System.out.println();
    }
  }
}