import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez un mot : ");
        String input = scanner.nextLine();
        
        if (isPalindrome(input)) {
            System.out.println("La chaîne est un palindrome.");
        } else {
            System.out.println("La chaîne n'est pas un palindrome.");
        }
    }
    
    public static boolean isPalindrome(String str) {
        
        
        int length = str.length();
        
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
