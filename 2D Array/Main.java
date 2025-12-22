class demonstrateTwoDArray
{
    public static void main(String args[])
    {
        int[][] matrix=
                {{1,2,3},
                 {4,5,6},
                 {7,8,9}};
        System.out.println("Two-D Array Dimensions:"+matrix.length+"rows x"+matrix[0].length+"columns");
        System.out.println("\nMatrix elements:");
        int total =0;
        for (int i=0;i<matrix.length;i++)
        {
            for (int j=0;j<matrix[i].length;j++)
            {
                if(i==j){
                    total+=matrix[i][j];
                }
                System.out.print(matrix[i][j] +"\t");

            }
            System.out.println();
        }
        System.out.println("Diagonal Addition:"+total);
    }

}
