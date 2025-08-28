import java.util.Scanner;

public class RotateImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of rows : ");
        int row = sc.nextInt();
        System.out.print("Enter no. of cols : ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        int[][] temp = arr;

        for(int i = 0; i<row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int m = 0; m < row; m++) {
            for(int n = col-1; n >= 0; n--) {
                System.out.print(temp[n][m] + " ");
            }
            System.out.println();
        }
    }
}

/*
Input           Output
1 2 3           7 4 1
4 5 6           8 5 2
7 8 9           9 6 3
*/