
package _03_regularexpression;

public class _03_regularExpression {

    public static void main(String[] args) {
//       String str1 = "a";
//       System.out.println(str1.matches("."));
//       System.out.println(str1.matches("[abc]"));
//       System.out.println(str1.matches("[^abc]"));
//       System.out.println(str1.matches("[a-zA-Z0-9]"));
//       System.out.println(str1.matches("a|b"));
//       System.out.println(str1.matches("abc"));
//       
//       String str2 = "a7";
//       System.out.println(str2.matches("[a-z][0-7]"));
       
       // meta chars
//       String str3 = "^";
//       System.out.println(str3.matches("\\w")); //true for both char and digits
//       System.out.println(str3.matches("\\d")); //digits
//       System.out.println(str3.matches("\\D")); //not digits 
//       System.out.println(str3.matches("\\W")); //not char or digits
//       System.out.println(str3.matches("\\s")); //space
//       System.out.println(str3.matches("\\S")); //not space
//       
       // quantifiers
       // * - 0 or more time
       // + - one or more
       // ? - 0 or 1 time
       // {X} - must be X times
       // {X,Y} - between X(min) and Y(max) times
       
       String str4 = "abcdf 5aaccedf";
       System.out.println(str4.matches(".*"));
       System.out.println(str4.matches("[a-z]*"));
       System.out.println(str4.matches("[a-z]?"));
       System.out.println(str4.matches("[a-z]+"));
       System.out.println(str4.matches("[a-z]{3}"));
       System.out.println(str4.matches("[a-z0-7]{3,50}"));
       
       String str5 = "nouros44@gmail.com"; //check for gmail
       System.out.println(str5.matches(".*gmail.*"));
       System.out.println(str5.matches("\\w*@gmail.*"));

    }
    
}
