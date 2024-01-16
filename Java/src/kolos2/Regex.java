package kolos2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex{
    static void usun(String zdanie){
        String regex="[!@#$%]";
        Pattern wzor=Pattern.compile(regex);
        Matcher matcher=wzor.matcher(zdanie);
        System.out.println(matcher.replaceAll(""));
    }
    static void sprawdz(String zdanie){
        String regex="^[0-9]{3}-[0-9]{3}-[0-9]{3}$";
        Pattern wzor=Pattern.compile(regex);
        Matcher matcher=wzor.matcher(zdanie);
        if(matcher.find()){
            System.out.println("Git");
        } else {
            System.out.println("nie git");
        }
    }
    public static void main(String[] args){
        Regex.usun("To! #jest@ przy$$$kladowe# zdanie%");
        Regex.sprawdz("111-222-333");
    }
}