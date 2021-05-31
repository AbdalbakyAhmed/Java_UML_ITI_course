import java.util.Scanner;
public class StringValidation{
    
   public boolean validtaeString(String str) {
      str = str.toLowerCase();
      char[] charArray = str.toCharArray();
      for (int i = 0; i < charArray.length; i++) {
         char ch = charArray[i];
         if (!(ch >= 'a' && ch <= 'z')) {
            return false;
         }
      }
      return true;
   }

   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string value: ");
      String str = sc.next();
      StringValidation obj = new StringValidation();
      boolean bool = obj.validtaeString(str);
      if(!bool) {
         System.out.println("Given String is invalid");
      }else{
         System.out.println("Given String is valid");
      }
   }
}

