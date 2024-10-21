package algoritmstring;

public class Class5 {
    public static void main(String[] args) {
        String soz = "axcvcnncyhd";
        String palindromeSoz = "";
        for (int i = 0; i < soz.length(); i++) {
            for (int j = i + 1; j <= soz.length(); j++) {
                String substring = soz.substring(i, j);
                if (isPalindrome(substring) && (substring.length() > palindromeSoz.length())) {
                    palindromeSoz = substring;
                }
            }
        }
        System.out.println("palindrom soz " + palindromeSoz);
    }


    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
