import java.util.Scanner;
public class Linearsearch {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 10, 40};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to search : ");
        int target = sc.nextInt();
        int num = sequenciallinearsearch(arr, target);
        System.out.println("The element is found at " + num + " position");
    }

    public static int sequenciallinearsearch(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target)
                return i;
        }
        return -1;
    }
}