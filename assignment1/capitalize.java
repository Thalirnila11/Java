package assignment1;

public class capitalize {

    public static String capitalizeFirstAndLast(String input) {
        
        String[] words = input.split(" ");

        
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 1) {
                
                String capitalizedWord = word.substring(0, 1).toUpperCase() + 
                                         word.substring(1, word.length() - 1) + 
                                         word.substring(word.length() - 1).toUpperCase();
                result.append(capitalizedWord).append(" ");
            } else {
                
                result.append(word.toUpperCase()).append(" ");
            }
        }

        
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "hello world java";
        String result = capitalizeFirstAndLast(input);
        System.out.println(result); 
    }
}
