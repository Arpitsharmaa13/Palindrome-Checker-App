public class palindrome{

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("   Welcome to Palindrome App");
        System.out.println("=================================");

        String word = "MADAM";
        String reverse = "";

        // reverse the word
        for(int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        // check palindrome
        if(word.equals(reverse)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}