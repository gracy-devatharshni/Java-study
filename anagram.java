import java.util.*;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        /*
         * char[] s1 = str1.toCharArray();
         * char[] s2 = str2.toCharArray();
         * Arrays.sort(s1);
         * Arrays.sort(s2);
         * if(Arrays.equals(s2, s2)){
         * System.out.println("anagram");
         * }
         * else{
         * System.out.println(" not a anagram");
         * }
         * 
         */
        int chars[] = new int[26];
        for (int i = 0; i < chars.length; i++) {
            chars[str1.charAt(i) - 'a']++;
            chars[str2.charAt(i) - 'a']--;
        }
        for (int i : chars) {
            if (i != 0) {
                System.out.println("not an anagram");
                return;
            }

        }

        System.out.println("anagram");

    }
}
