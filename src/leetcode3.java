import java.util.Arrays;

public class leetcode3 {


    String[] string;


    public leetcode3() {
        string = new String[]{"flower", "flow", "florida"};

        longestCommonPrefix(string);
        System.out.println(longestCommonPrefix(string));

    }

    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        Arrays.sort(strs);

        String prefix = strs[0];
        String suffix = strs[strs.length  - 1];


        for (int i = 0; i < Math.max(prefix.length(),suffix.length()); i++) {

            if (prefix.charAt(0) != suffix.charAt(1)) {

                System.out.println(result);
                return result.toString();
            }

            result.append(prefix.charAt(i));
        }
        return "";

    }


    public static void main(String[] args) {
        new leetcode3();
    }
}
