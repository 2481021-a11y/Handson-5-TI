public class ArraysDeepDivePractice {
    public static void main(String[] args) {
        System.out.println("=== ARRAY MULTIDIMENSI DASAR ===");

        //bikin array 2D 3x4
        //array kosong
        int[][] matrix = new int[3][4];

        //isi satu per satu
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[0][3] = 4;

        matrix[1][0] = 5;
        matrix[1][1] = 6;
        matrix[1][2] = 7;
        matrix[1][3] = 8;

        matrix[2][0] = 9;
        matrix[2][1] = 10;
        matrix[2][2] = 11;
        matrix[2][3] = 12;

        //print matriksnya
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        //latihan 2: Array 2D string papan catur 3x3
        System.out.println("\n=== LATIHAN 2: Papan Catur 3x3 ===");
        String[][] papan = new String[3][3];

        for (int i = 0; i < papan.length; i++) {
            for (int j = 0; j < papan[i].length; j++) {
                papan[i][j] = ".";
            }
        }


        papan[0][0] = "X";
        papan[1][1] = "X";
        papan[2][2] = "X";


        papan[0][2] = "O";
        papan[1][0] = "O";
        papan[2][1] = "O";

        //print papan
        for (int i = 0; i < papan.length; i++) {
            for (int j = 0; j < papan[i].length; j++) {
                System.out.print(papan[i][j] + " ");
            }
            System.out.println();
        }
    }
}