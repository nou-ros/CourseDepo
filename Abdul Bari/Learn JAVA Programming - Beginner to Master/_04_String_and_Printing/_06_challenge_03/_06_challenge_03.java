
package _06_challenge_03;

public class _06_challenge_03 {


    public static void main(String[] args) {
        // TODO code application logic here
        
        //Remove special chars from a string
        //Remove extra spaces from string
        //Find number of words in a string
        
        String str = "a!B@c#1$2%3";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
        String str1 = "   ab cd  efg   ij";
        System.out.println(str1.replaceAll("\\s+", "").trim());
        
        String str2 = "The quick brown fox jumps over the lazy dog.";
        String words[] = str2.split("\\s");
        System.out.println(words.length);
           
    }
    
}
