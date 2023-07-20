public class LearnStrings {
    public static void main(String[] args) {
        String phoneNumber = "(234) 333-5551";
        String areaCode = "";
        String exchange = "";
        String lineNumber = "";

        areaCode = phoneNumber.substring(1,4);
        exchange = phoneNumber.substring(phoneNumber.indexOf('-')-3,phoneNumber.indexOf('-'));
        lineNumber = phoneNumber.substring(phoneNumber.indexOf('-') + 1);

        System.out.println(areaCode);
        System.out.println(exchange);
        System.out.println(lineNumber);
    }
}
