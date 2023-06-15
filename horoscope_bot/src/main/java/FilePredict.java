import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilePredict {
    private String line, zodiaknum;
    private int language;
    private int predicTheme;
    public String message_predict = "";

    public FilePredict(int zodiaknum, int language, int predicTheme) {
        this.zodiaknum = String.valueOf(zodiaknum);
        this.language = language;
        this.predicTheme = predicTheme;
    }

    private String fileName(){
        String fileName = "Передбачення";
        switch (predicTheme) {
            case 1 -> {
                fileName = fileName + "/Фінанси";
            }
            case 2 -> {
                fileName = fileName + "/Кар'єра";
            }
            case 3 -> {
                fileName = fileName + "/Кохання";
            }
            default -> System.out.println("Помилка в тематиці");
        }
        switch (language) {
            case 1 -> {
                fileName = fileName + "/укр";
            }
            case 2 -> {
                fileName = fileName + "/eng";
            }
            default -> System.out.println("Помилка в мові");
        }
        fileName = fileName + "/" + zodiaknum + ".txt";
        return fileName;
    }

    public String getPredict(){
        FileReader fr = null;
        try {
            fr = new FileReader((fileName()));
            Scanner scan = new Scanner(fr);
            while (scan.hasNextLine()) {
                message_predict = message_predict + scan.nextLine();
            }
            System.out.println(message_predict);

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return message_predict;
    }
}
