import java.util.Scanner;

public class Palindrome {
    /*
    public static void main(String[] args) { // через аргументы командной строки
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if (isPalindrome(s)) {
                System.out.println(s + " is a palindome");
            } else {
                System.out.println(s + " is not a palindome");
            }
        }
    }*/
    public static void main(String[] args) { // через system.in
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            if (isPalindrome(s)) {
                System.out.println(s + " is a palindome");
            } else {
                System.out.println(s + " is not a palindome");
            }
        }
    }

    public static String reverseString(String s) {
        StringBuilder revStr = new StringBuilder();

        for (int i = s.length() - 1; i > -1; --i) {
            revStr.append(s.charAt(i));
        }
        return revStr.toString();
    }

    public static boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    }
}
