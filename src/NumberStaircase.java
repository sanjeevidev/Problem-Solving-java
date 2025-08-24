import java.util.*;
public class NumberStaircase {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int count, flag = 1;
            for(int i = 1; i<=num;i++){
                count = flag;
                for(int j = 1; j <= num; j++){
                    count = count > num ? count - num : count;
                    System.out.print(count + " ");
                    count++;
                }
                flag++;
                System.out.println();
            }
        }
    }
}
