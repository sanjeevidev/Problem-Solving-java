import java.util.Scanner;

public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 10, 40};
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the element to search : ");
            int target = sc.nextInt();
            int num = intervalbinarysearch(arr, target);
            System.out.println("The element is found at " + num + " position");
        }
    }

    public static int intervalbinarysearch(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;

        while (left <= right) {
            int mid = (left+right)/2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        return -1;
    }
}
