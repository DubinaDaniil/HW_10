import validPhoneNumber.*;
import wordCounter.*;
import workWithFiles.FileReader;
import workWithFiles.FileWriter;

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {

        ValidPhoneNumber validPhoneNumber = new ValidPhoneNumber();
        System.out.println(validPhoneNumber.validPhoneNumber());


        new FileWriter().writeFile();
        FileReader fileReader = new FileReader();
        System.out.println(fileReader.readFile(new File("src/main/resources/convertToJson/userData.json")));

        WordCounter wordCounter = new WordCounter();
        wordCounter.sorted();
    }
}
