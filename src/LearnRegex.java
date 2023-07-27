import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnRegex {
    public static void main(String[] args) {
//        String[] phoneNumbers = {
//                "+60123456789",   // phone number with country code that has 10 digits
//                "+601123456789",  // phone number with country code that has 11 digits
//                "60123456789",    // phone number with country code that has 10 digits
//                "601123456789",   // phone number with country code that has 11 digits
//                "0123456789",     // phone number with no spaces that has 10 digits
//                "01123456789",    // phone number with no spaces that has 11 digits
//                "012-3456789",    // phone number with a hyphen that has 10 digits
//                "011-23456789",   // phone number with a hyphen that has 11 digits
//                "012 3456789",    // phone number with a space that has 10 digits
//                "011 23456789"    // phone number with a space that has 11 digits
//        };

//        for(String phoneNumber: phoneNumbers){
//            System.out.println(phoneNumber.matches(regex));
//        }

        String input = "+60109835058";

        String regex = """
# This is a regex for Malaysia's mobile phone number
(\\+?6?0) # Country code
1(1[-\\s]*\\d{8}|[\\d&&[^1]][-\\s]*\\d{7}) # The rest of the number
""";

        Pattern malaysiaPhoneNumberPat = Pattern.compile(regex, Pattern.COMMENTS);
        Matcher malaysiaPhoneNumberMat = malaysiaPhoneNumberPat.matcher(input);

        if(malaysiaPhoneNumberMat.matches()){
            System.out.println(malaysiaPhoneNumberMat.group(0));
            System.out.println(malaysiaPhoneNumberMat.group(1));
//            System.out.println(malaysiaPhoneNumberMat.group(2));
//            System.out.println(malaysiaPhoneNumberMat.group(3));
//            System.out.println(malaysiaPhoneNumberMat.group(4));
        }
    }
}
