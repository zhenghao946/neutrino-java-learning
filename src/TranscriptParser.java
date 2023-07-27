import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TranscriptParser {
    public static void main(String[] args) {
        String transcript = """
                Student Number:	1234598872			Grade:		11
                Birthdate:		01/02/2000			Gender:	M
                State ID:		8923827123

                Cumulative GPA (Weighted)		3.82
                Cumulative GPA (Unweighted)	3.46
                """;
        String regex = """
                Student\\s*Number:\\s*(?<studentNumber>\\d{10}).*
                Grade:\\s*(?<studentGrade>\\d{1,2}).*
                Birthdate:\\s*(?<birthdateDay>\\d{2})/(?<birthdateMonth>\\d{2})/(?<birthdateYear>\\d{4}).*
                Gender:\\s*(?<gender>\\w).*
                State\\s*ID:\\s*(?<stateId>\\d{10}).*
                Cumulative\\s*GPA\\s*\\(Weighted\\)\\s*(?<CgpaWeighted>\\d.\\d{2}).*
                Cumulative\\s*GPA\\s*\\(Unweighted\\)\\s*(?<CgpaUnweighted>\\d.\\d{2}).*
                """;
        Pattern pattern = Pattern.compile(regex, Pattern.DOTALL | Pattern.COMMENTS);
        Matcher matcher = pattern.matcher(transcript);
        if(matcher.matches()){
            System.out.println("Student number: " + matcher.group("studentNumber"));
            System.out.println("Grade: " + matcher.group(2));
            System.out.println("Birthday\nDay: " + matcher.group(3));
            System.out.println("Month" + matcher.group(4));
            System.out.println("Year" + matcher.group(5));
            System.out.println("Gender" + matcher.group(6));
            System.out.println("State ID" + matcher.group(7));
            System.out.println("CGPA" + matcher.group(8));
            System.out.println(matcher.group(9));
        }
    }
}