public class StringBufferBuilder 
{
    public static void main(String[] args) 
    {
        String s1=new String("Hello");
        // Thread safe & mutable
        StringBuffer s2=new StringBuffer("Hello");
        // not thread safe but mutable
        StringBuilder s3=new StringBuilder("Hello");
        
        s1.concat(" World");
        s2.append(" World");
        s3.append(" World");
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
    }   
}
