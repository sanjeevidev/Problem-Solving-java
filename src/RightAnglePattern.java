import java.util.Scanner;

public class RightAnglePattern{
    public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the value : ");
            int n = sc.nextInt();

            for(int i = 1;i <=n; i++){
                for(int j=i;j<n;j++){
                    System.out.print("   ");
                }
                for(int j=i;j>=1;j--){
                    System.out.print(j + "  ");
                }
                System.out.println();
            }
       }
    }
}