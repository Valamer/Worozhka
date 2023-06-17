import java.io.*;
import java.util.Scanner;

public class FilePredict {
    private String line, zodiaknum;
    private String language;
    private String predicTheme;
    public String message_predict = "";

    public FilePredict(int zodiaknum, String language, String predicTheme) {
        this.zodiaknum = String.valueOf(zodiaknum);
        this.language = language;
        this.predicTheme = predicTheme;
    }

    private String fileName(){
        String fileName = "Передбачення";
        switch (predicTheme) {
            case "finance" -> {
                fileName = fileName + "/Фінанси";
            }
            case "career" -> {
                fileName = fileName + "/Кар'єра";
            }
            case "love" -> {
                fileName = fileName + "/Кохання";
            }
            default -> System.out.println("Помилка в тематиці");
        }
        switch (language) {
            case "ukr" -> {
                fileName = fileName + "/укр";
            }
            case "eng" -> {
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
