public class MaximumSumOrProduct {
    public static void main(String[] args) {
        int[] num = {120, 24, 71, 10, 59};
        for (int i : num){
            int result = SumOrProduct(i);
            System.out.print(result + " ");
        }
    }

    static int SumOrProduct(int num){
        int sum = 0;
        int product = 1;
        while(num > 0){
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        return Math.max(sum, product);
    }
    
}
