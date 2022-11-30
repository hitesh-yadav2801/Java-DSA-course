package RecursionAndBacktracking;

public class LengthOfString {
    public static void main(String[] args) {
        System.out.println(lengthOfString("Hello Nisha"));
    }
    static int lengthOfString(String s){
        if (s.isEmpty()) return 0;
        return lengthOfString(s.substring(1))+1;
    }
}
