import java.sql.SQLOutput;
import java.util.*;

public class RotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Input String : ");
        String s = sc.next();
        System.out.print("Enter the Goal String : ");
        String goal = sc.next();

        if(s.length() != goal.length())
            System.out.print("False");

        String result = s + s;
        System.out.println(result.contains(goal) ? "True" : "False");
    }
}
