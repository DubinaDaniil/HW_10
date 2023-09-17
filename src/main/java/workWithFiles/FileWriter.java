package workWithFiles;

import com.google.gson.*;
import user.*;
import java.io.*;

public class FileWriter {

    FileReader fileReader = new FileReader();
    String[] userDataFromTxt = fileReader.readFileOneLine(new File("src/main/resources/convertToJson/userData.txt")).split(" ");
    UserData alice = new UserData(userDataFromTxt[2], Integer.parseInt(userDataFromTxt[3]));
    UserData ryan = new UserData(userDataFromTxt[4], Integer.parseInt(userDataFromTxt[5]));

    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    String aliceString = gson.toJson(alice);
    String ryanString = gson.toJson(ryan);


    public void writeFile() {
        try (java.io.FileWriter fWriter = new java.io.FileWriter("src/main/resources/convertToJson/userData.json")) {
            fWriter.write("[\n");
            fWriter.write(aliceString);
            fWriter.write(",\n");
            fWriter.write(ryanString);
            fWriter.write("\n]");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
