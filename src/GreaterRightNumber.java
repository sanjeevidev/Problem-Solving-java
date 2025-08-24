public class GreaterRightNumber {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        FindGreaterRight(arr);

        // Display the result
        for(int x=0;x<arr.length;x++){
            System.out.print(arr[x] + " ");
        }
    }

    static void FindGreaterRight(int[] arr){
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];     // store current element
            arr[i] = max; // replace with max to its right
            if (temp > max) {
                max = temp;  // update maxFromRight
            }
        }
    }
}
