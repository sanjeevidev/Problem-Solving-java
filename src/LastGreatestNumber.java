import java.util.*;

class LastGreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num : ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print(nums[0] + " ");

        for (int i = 1; i < n; i++) {
            if(nums[i] > nums[i-1]) {
                System.out.print(nums[i] + " ");
            }
        }
    }
}

/*
Input - 2, -3, -4, 5, 9, 7, 8
Output - 2 5 9 8
*/