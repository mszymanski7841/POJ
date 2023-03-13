public class Zadanie4 {
    static void printMatrix(int[][] tab){
        for(int i=0; i<tab.length;i++){
            for(int j=0; j<tab[i].length;j++){
                System.out.print(tab[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        printMatrix(matrix);

    }
}
