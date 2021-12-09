
package _04_challenge_01;


public class _04_challenge_01 {

    public static void main(String[] args) {
        //find if the email id on gmail
        //find username and domain name from gmail
        
        String str = "programmer@hotmail.com";
        System.out.println(str.matches(".*gmail.*"));
        int i = str.indexOf("@");
        String username = str.substring(0,i);
        String domain = str.substring(i+1, str.length());
        System.out.println("username: " + username + ", domain: " + domain);
        System.out.println(str.startsWith(domain));
    }
    
}
