package validPhoneNumber;

import workWithFiles.FileReader;
import java.io.*;
import java.util.regex.*;

public class ValidPhoneNumber {

    FileReader fileReader = new FileReader();
    String[] numbers;
    StringBuilder result = new StringBuilder();

    public StringBuilder validPhoneNumber() {
        numbers = fileReader.readFile(new File("src/main/resources/phoneNumber/numbersDB.txt")).split("\n");
        Pattern pattern = Pattern.compile("^((\\(\\d{3}\\))|\\d{3})[- ]?\\d{3}-\\d{4}$");
        for (final String number : numbers) {
            Matcher matcher = pattern.matcher(number);
            while (matcher.find()) {
                result.append(matcher.group()).append("\n");
            }
        }
        return result;
    }
}
