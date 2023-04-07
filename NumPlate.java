package RoughWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumPlate {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter num plate to see if it is valid");
        System.out.println("format should be [mh12ab1234] or [mh/12/ab/1234] or [mh-12-ab-1234] ");
        String Num = br.readLine().toUpperCase();

        String regexPattern = "^[A-Z]{2}-?/?[0-9]{1,2}-?/?[A-Z]{2}-?/?[0-9]{1,4}$";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(Num);

        boolean result = matcher.matches();
        if(result){
            System.out.println("number plate is valid");
        }else {
            System.out.println("number plate is invalid");
        }

    }
}
