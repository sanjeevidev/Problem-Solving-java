import java.util.*;

class ColumnName {
    public static String convertToColumnName(int n) {
        StringBuilder column = new StringBuilder();

        while (n > 0) {
            n--; // adjust to 0-based
            int remainder = n % 26;
            column.append((char) ('A' + remainder));
            n /= 26;
        }

        return column.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cell value : ");
        int n = sc.nextInt();

        System.out.println("Excel Column: " + convertToColumnName(n));
    }
}

/*
Input_1 - 26
Output_1 - Z
Input_2 - 51
Output_2 - AY
*/