import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str="(84)-(0978489648)";
        int num=01023012;
        System.out.println(check(str));
    }

    public static boolean check(String str){

        Pattern p = Pattern.compile("^[(]\\d{2}[)]-[(]0[0-9]{7,9}[)]");
        Matcher m = p.matcher(str);
        boolean b = m.matches();

        return b;
    }

    
}