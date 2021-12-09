
package _02_stringpractice;


public class _02_stringPractice {

    public static void main(String[] args) {
        //will be inside string pool
        String str1 = "Java Program";
        
        //will be in heap as well as in string pool
        String str2 = new String("Java");
        
        char c[] = {'H', 'e', 'l', 'l', 'o'};
        
        String str3 = new String(c);
        
        byte b[] = {65, 66, 67, 68};
        // start from index 2 to next 2 elements
        String str4 = new String(b,2,2);
        System.out.println(str4);
        
        String str5 = "C/C++";
        String str6 = "c/c++";
        String str7 = new String("C/C++");
        System.out.println(str5==str7);
        
        // String methods - 01
        /*
        String ideName = new String("netbeans");
        System.out.println(ideName.length());
        System.out.println(ideName.toUpperCase());
        System.out.println(ideName.trim());
        System.out.println(ideName.substring(3,7));
        System.out.println(ideName.replace('e', 'M'));
        */
         // String methods - 02
         /*
        String name = "Mr. Nouros Yousuf";
        System.out.println(name.startsWith("Mr."));
        System.out.println(name.startsWith("N", 4));
        System.out.println(name.endsWith("suf"));
        System.out.println(name.charAt(5));
        System.out.println("");
        for(int i=0; i<name.length();i++)
        {
            System.out.print(name.charAt(i));
        }
        System.out.println();
        String site = "www.udemy.co.bd";
        System.out.println(site.indexOf("udemy"));
        System.out.println(site.indexOf(".",4));
        System.out.println(site.lastIndexOf("."));
        */
        
         // String methods - 03
         String scene = "Pyramid";
         String scene_2 = "Pyramid";
         String scene_3 = "pyramid";
         
         System.out.println(scene.equals(scene_3));
         System.out.println(scene.equalsIgnoreCase(scene_3));
         
         String scene_4 = new String("Pyramid");
         
         System.out.println(scene==scene_4);
         System.out.println(scene.equals(scene_4));
         
         
         System.out.println(scene.compareTo(scene_3));
         System.out.println(scene.compareTo(scene_4));
         
         String scene_5 = "The great wall of chaina";
         String scene_6 = " - Wonders of the world.";
         System.out.println(scene_5.contains("wall"));
         System.out.println(scene_5.concat(scene_6));
         System.out.println(String.valueOf(6));
    }
    
}
