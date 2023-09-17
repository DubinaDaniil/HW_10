package workWithFiles;

import java.io.*;
import java.util.*;

public class FileReader {

    StringBuilder stringBuilder = new StringBuilder();

    public String readFile(File file) {
        if (file.exists()) {
            try (FileInputStream fileInputStream = new FileInputStream(file);
                 Scanner scanner = new Scanner(fileInputStream)) {
                while (scanner.hasNext()) {
                    stringBuilder.append(scanner.nextLine()).append("\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return String.valueOf(stringBuilder);
    }

    public String readFileOneLine(File file) {
        if (file.exists()) {
            try (FileInputStream fileInputStream = new FileInputStream(file);
                 Scanner scanner = new Scanner(fileInputStream)) {
                while (scanner.hasNext()) {
                    stringBuilder.append(scanner.nextLine()).append(" ");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return String.valueOf(stringBuilder);
    }
}
