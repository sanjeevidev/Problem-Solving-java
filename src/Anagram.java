import java.util.Scanner;

public class Anagram {

    public static boolean isAnagram(String str1, String str2) {

        if(str1.length() != str2.length()) { // Checks if both string has equal length
            return false;
        }

        int str_xor = 0; // XOR sum

        for(int i = 0; i < str1.length(); i++){
            str_xor ^= str1.charAt(i);
        }

        for(int j = 0; j < str2.length(); j++) {
            str_xor ^= str2.charAt(j);
        }

        return str_xor == 0;
    }

    public static boolean isAnagramFreq(String str1, String str2) {

        if(str1.length() != str2.length()) return false; // Checks if both strings has equal length

        int[] freq = new int[26];
        for(int i = 0; i<str1.length(); i++) {
            freq[str1.charAt(i) - 'a']++;
            freq[str2.charAt(i) - 'a']--;
        }

        for(int i : freq) {
            if(i!=0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string 1 : ");
        String str1 = sc.next();
        System.out.print("Enter the string 2 : ");
        String str2 = sc.next();

        System.out.println("Anagram : " + isAnagram(str1, str2));
        System.out.println("Anagram : " + isAnagramFreq(str1, str2));
    }
}
