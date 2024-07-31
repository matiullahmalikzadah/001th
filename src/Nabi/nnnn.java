package Nabi;

public class nnnn {
    public static void main(String[] args) {
        String a = "book is on the table";
        String b = reverseWords(a);
        System.out.println("Reversed words: " + b);
    }

    public static String reverseWords(String str) {
        String[] c = str.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = c.length - 1; i >= 0; i--) {
            reversed.append(c[i]).append(" ");
        }
        return reversed.toString().trim();
    }
}
