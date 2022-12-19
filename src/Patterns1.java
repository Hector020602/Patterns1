import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patterns1 {
    public static void main(String[] args) {
        Pattern patter = Pattern.compile("abc");
        Matcher matcher = patter.matcher("12345abc6789");
        System.out.println(matcher.find());
        System.out.println(matcher.find());
        System.out.println(matcher.find());

    }

}
