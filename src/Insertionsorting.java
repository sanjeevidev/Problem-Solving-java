public class Insertionsorting {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        selectionsort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    static void selectionsort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;

            while(j>0 && arr[j]>key){
                arr[j+1] = arr[j];
                j-=1;
            }
            arr[j+1] = key;
        }
    }
}
