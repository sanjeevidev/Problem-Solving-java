public class EquilibriumArray {
    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int num = FindEquilibrium(arr);
        System.out.println("Equilibrium index : " + num);
    }

    static int FindEquilibrium(int[] arr){
        int totalsum = 0;
        for(int num : arr){
            totalsum+=num;
        }

        int leftsum = 0;
        for(int i=0;i<arr.length;i++){
            int rightsum = totalsum-leftsum-arr[i];
            if(leftsum == rightsum)
                return i;
        leftsum+=arr[i];
        }
        return -1;
    }
}