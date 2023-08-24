public class testfile {
    public static void main(String [] args){
        int rows = 3;
        int cols = 3;
        int[][] matrix = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                matrix[i][j] = 0;
            }
        }
        matrix[1][0] = 1;
        int j = 0;
        for(int i = 0 ; i< rows; i++){
            if(matrix[i][j] == 0){
                matrix[i][j] = 1;
            }else{
                matrix[i][j] = 0;
            }
        }
        for(int i = 0; i < rows; i++){
            for(int k = 0; k < cols; k++){
                System.out.print(matrix[i][k] + " ");
            }
            System.out.println();
        }
    }
}
