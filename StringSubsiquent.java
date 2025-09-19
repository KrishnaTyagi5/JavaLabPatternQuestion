import java.util.*;

public class StringSubsiquent {
    public static void main(String[] args) {
        String str = "joy";
        int len = str.length();
        ArrayList<String> arr = new ArrayList<>();
        arr.add(" ");
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            String str2 = String.valueOf(ch);
            int len2=arr.size();
            for (int j = 0; j < len2; j++) {
                String str1 = arr.get(j);
                str1 = str1.concat(str2);
                arr.add(str1);
            }
        }
        System.out.print(arr);
    }

}
