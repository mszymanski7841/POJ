public class Zadanie5 {
    static int[][] sumMatrix(int[][] tab, int[][] tab2) {
        int[][] tab3 = new int[tab.length][tab[0].length];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab3[i][j] = tab[i][j] + tab2[i][j];
            }
        }
        return tab3;
    }
    public static void main(String[] args) {
        int[][] matrix = {{5,26,37}, {4,5,6}};
        int[][] matrix2 = {{7,8,9}, {10,11,12}};
        int[][] result = sumMatrix(matrix,matrix2);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
}
}
