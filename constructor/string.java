public class string{
    public static void main(String[] args) {
        String input = "Java is fun";
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
