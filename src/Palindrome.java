import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        int n = str.length() - 1;
        for (int i = 0; i < n; i++) {
            if(str.charAt(i) != str.charAt(n-i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.next();
        System.out.println("Palindrome : " + isPalindrome(str));
    }
}
