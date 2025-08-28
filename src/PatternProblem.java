import java.util.Scanner;

public class PatternProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the pattern length : ");
        int num = sc.nextInt();

        for(int i = 1; i < num+1; i++) {
            int temp = i;
            for(int j = 1; j <= i; j++) {
                System.out.print(temp + " ");
                temp += num-j;
            }
            System.out.println();
        }
    }
}

/*
Output
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
*/