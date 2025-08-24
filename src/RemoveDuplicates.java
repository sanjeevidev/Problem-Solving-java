import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "Java1234";
        FindDuplicate(str);
    }

    static void FindDuplicate(String str) {
        StringBuilder result = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        for (char c : str.toCharArray()) {
            if(seen.contains(c)){
                char nextChar = (char) (c + 1);

                if (c == 'z') {
                    nextChar = 'a';
                }
            result.append(nextChar);
            }
            seen.add(c);
        }
        System.out.println(result.toString());
    }
}
