import org.testng.annotations.*;

import java.util.regex.*;

import static org.testng.Assert.*;

public class PhoneNumberValidation {

    Pattern pattern = Pattern.compile("^((\\(\\d{3}\\))|\\d{3})[- ]?\\d{3}-\\d{4}$");
    String[] correctNumbers = new String[]{"987-123-4567", "(123) 456-7890"};
    String inCorrectNumbers = "123 456 7890";

    @Test
    public void isCorrectNumber() {
        for (final String correctNumber : correctNumbers) {
            Matcher matcher = pattern.matcher(correctNumber);
            assertTrue(matcher.matches());
        }
    }

    @Test
    public void isInCorrectNumber() {
        Matcher matcher = pattern.matcher(inCorrectNumbers);
        assertFalse(matcher.matches());
    }
}
