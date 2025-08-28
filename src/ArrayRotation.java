import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        // User Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements in Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n;i++){
            int num = sc.nextInt();
            arr[i] = num;
        }

        // // Pre-defined Array
        //int[] arr = {10, 20, 30, 40};

        int[] temp = new int[arr.length * 2];
        for(int i=0; i<arr.length;i++){
            temp[i] = arr[i];
            temp[i + arr.length] = arr[i];
        }

        for(int i = 1; i<arr.length+1; i++){
            for(int j = i; j<i+arr.length;j++){
                System.out.print(temp[j] + " ");
            }
            System.out.println();
        }

    }
}
/*
Input -> 1 2 3 4 5

2 3 4 5 1
3 4 5 1 2
4 5 1 2 3
5 1 2 3 4
1 2 3 4 5

 */
