package progjomv002;

public class ProgJOMV002 {

    public static void main(String[] args) {
        char[][] mat = new char[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == i || (i + j) == 9) {
                    mat[i][j] = '1';
                } else {
                    mat[i][j] = '*';
                }
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("--------------------");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0 || j == 9 || i == 0 || i == 9) {
                    mat[i][j] = '1';
                } else {
                    mat[i][j] = '*';
                }
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("--------------------");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((i + j) < 9 || (i + j) > 9) {
                    mat[i][j] = '1';
                } else {
                    mat[i][j] = '*';
                }
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("\n");

        }
        // TODO code application logic here
    }