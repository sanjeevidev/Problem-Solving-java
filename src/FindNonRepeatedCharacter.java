import java.util.Scanner;

public class FindNonRepeatedCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str = sc.next();

        int[] values = new int[256];

        for(int i = 0; i < str.length(); i++) {
            values[str.charAt(i)]++;
        }

        for(int i = 0; i < values.length; i++) {
            if(values[i] == 1) {
                System.out.print((char) i + " ");
            }
        }
    }
}

/*
Input - Code@*@code
Output - * C c // Repeated once in the Input String
 */