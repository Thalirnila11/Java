package assignment3;

public class remove_space {
    public static void main(String[] args) {
        String str = "This is a sample string with spaces";
        
        
        
        for (int i = 0; i < str.length(); i++) {
            
            if (str.charAt(i) != ' ') {
              System.out.print(str.charAt(i));
            }
        }
        
       
    }
    
}
