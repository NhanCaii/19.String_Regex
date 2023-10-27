import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str="C0234G";
        System.out.println(check(str));
    }

    public static boolean check(String str){

        Pattern p = Pattern.compile("^[CAP][0-9]{4}[GHIK]");
        Matcher m = p.matcher(str);
        boolean b = m.matches();

        return b;
    }
}