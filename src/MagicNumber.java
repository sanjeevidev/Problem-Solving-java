import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int magic_num = 0;
        int sum = 0;
        while(num > 0) {
            sum = num % 10;
            magic_num += (sum * sum * sum);
            num = num / 10;
        }
        System.out.println(magic_num);
    }
}
