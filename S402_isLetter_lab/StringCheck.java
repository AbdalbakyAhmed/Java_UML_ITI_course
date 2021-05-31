import java.util.*;
import java.util.stream.IntStream;

public class StringCheck {
    public static void main(String[] args) {
        String _str ;
        // System.out.println("Enter a string value: ");
        // _str = System.console().readLine();
        // System.out.println(_str);
        // int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
        // // display original values
        // System.out.print("Original values: ");
        // IntStream.of(values).forEach(value ->System.out.printf("%d ", value));
        // System.out.println();
        // _str = System.console().readLine();
        _str = " ";
        // IntStream.of(_str).chars
        boolean x = _str.chars().allMatch(Character::isLetter);
        // IntStream.of(_str).forEach(v -> v.length > 0);
        System.out.println(x);
    }
}
