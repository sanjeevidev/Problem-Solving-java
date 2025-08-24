public class Selectionsorting {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        selectionsort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    static void selectionsort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
        int min = i;
            for(int j=i+1;j<arr.length;j++)
                if (arr[min] > arr[j])
                    min = j;
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
