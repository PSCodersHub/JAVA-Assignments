// Question-2

class UserString {
    private String text;

    public UserString(String text) {
        this.text = text;
    }

    // a) Count characters
    public int countCharacters() {
        return text.length();
    }

    // b) Count words
    public int countWords() {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }
        // Split by spaces and count
        String[] words = text.trim().split("\\s+");
        return words.length;
    }

    // c) Compare strings
    public boolean compareStrings(String other) {
        return text.equals(other);
    }

    // d) Convert to uppercase
    public String toUpperCase() {
        return text.toUpperCase();
    }

    // e) Convert to lowercase
    public String toLowerCase() {
        return text.toLowerCase();
    }

    // f) Concatenate strings
    public String concatenate(String other) {
        return text + other;
    }

    // g) Check palindrome
    public boolean isPalindrome() {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        String reversed = "";

        // Reverse the string manually
        for (int i = clean.length() - 1; i >= 0; i--) {
            reversed = reversed + clean.charAt(i);
        }

        return clean.equals(reversed);
    }

    // h) Find character position
    public int findChar(char c) {
        return text.indexOf(c);
    }

    // i) Make substring
    public String substring(int start, int end) {
        return text.substring(start, end);
    }

    // j) Search substring
    public boolean contains(String sub) {
        return text.contains(sub);
    }

    // k) Replace substring
    public String replace(String old, String newStr) {
        return text.replace(old, newStr);
    }

    // l) Swap substrings between two strings
    public static String[] swap(UserString s1, UserString s2, String sub1, String sub2) {
        return new String[] {
                s1.text.replace(sub1, sub2), s2.text.replace(sub2, sub1)
        };
    }

    public String getText() {
        return text;
    }
}

// Demo class
public class StringOperationsDemo {
    public static void main(String[] args) {
        UserString str = new UserString("Hello Java World");

        System.out.println("Characters: " + str.countCharacters());
        System.out.println("Words: " + str.countWords());
        System.out.println("Compare: " + str.compareStrings("Hello"));
        System.out.println("Upper: " + str.toUpperCase());
        System.out.println("Lower: " + str.toLowerCase());
        System.out.println("Concat: " + str.concatenate(" Programming"));
        System.out.println("Palindrome: " + new UserString("madam").isPalindrome());
        System.out.println("Find 'a': " + str.findChar('a'));
        System.out.println("Substring: " + str.substring(0, 5));
        System.out.println("Contains 'Java': " + str.contains("Java"));
        System.out.println("Replace: " + str.replace("Java", "Python"));

        String[] swapped = UserString.swap(str, new UserString("World Java Hello"), "Hello", "World");
        System.out.println("Swapped: " + swapped[0] + " | " + swapped[1]);
    }
}

/*
 * FINAL OUTPUT:
 * 
 * Characters: 16
 * Words: 3
 * Compare: false
 * Upper: HELLO JAVA WORLD
 * Lower: hello java world
 * Concat: Hello Java World Programming
 * Palindrome: true
 * Find 'a': 7
 * Substring: Hello
 * Contains 'Java': true
 * Replace: Hello Python World
 * Swapped: World Java World | Hello Java Hello
 */