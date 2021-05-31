import java.util.function.BiPredicate;

public class stringUtils {
    public static String betterString (String s1, String s2, BiPredicate<String, String> p) {
        if (p.test(s1, s2)){
            return s1;
        } 
        else
        {
            return s2;
        }
    }

    public static void main(String[] args) {
        String string1 = new String("Hello");
        String string2 = new String("Welcome");
        
        
        // stringUtils.betterString(string1, string2, ( t,  u) -> t.equals(u));

        String longer = stringUtils.betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());
        
        
        String first = stringUtils.betterString(string1, string2, (s1, s2) -> true);
        
        // String eq= stringUtils.betterString(string1, string2, (s1,s2)->s1.equals(s2));
        
        System.out.println("out 1 "+longer+" "+first);
    }    
}
