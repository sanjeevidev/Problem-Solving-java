import java.util.*;

class GoodPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num : ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int pairs = 0;

        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(nums[i] == nums[j]) {
                    pairs++;
                }
            }
        }

        System.out.println("Total Pairs : " + pairs);
    }
}

/*
Input - [1,2,3,1,1,3]
Output - 4 -
Explanation - There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
*/