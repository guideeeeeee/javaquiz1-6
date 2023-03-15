class show49Sharp{
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