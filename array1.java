public class array1 {
    public static void main(String[] args) {
        
        int  [][] matrix = {
            {4,5,7},
            {3,7,8,}
        };
        for (int i=0 ; i<2 ; i++){
            for (int j = 0 ; j<3 ; j++){
                System.out.print(matrix [i][j] + " ");
            }
            System.out.println();
        }
    }
}