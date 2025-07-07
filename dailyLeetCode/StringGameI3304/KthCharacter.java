public class KthCharacter {
    public static char findKthChar(int k) {
        String word = "a";

        while (word.length() < k) {
            StringBuilder newString = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                char nextChar = (char)(ch + 1);
                newString.append(nextChar);
            }

            word += newString.toString();
        }

        return word.charAt(k - 1); // k is 1-based index
    }

    public static void main(String[] args) {
        System.out.println(findKthChar(3)); // For example, output the 3rd character
    }
}
