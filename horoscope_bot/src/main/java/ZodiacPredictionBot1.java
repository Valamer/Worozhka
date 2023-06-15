import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ZodiacPredictionBot1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть дату народження (у форматі РРРР-ММ-ДД): ");
        String birthdate = scanner.nextLine();

        int predictionNumber = calculatePredictionNumber(birthdate);
        String prediction = getPrediction(predictionNumber);

        System.out.println("Ваше передбачення: " + prediction);

        scanner.close();
    }

    private static int calculatePredictionNumber(String birthdate) {
        int sum = 0;
        for (char c : birthdate.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        return sum % 10;
    }

    private static String getPrediction(int number) {
        String fileName = number + ".txt";
        StringBuilder prediction = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                prediction.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return prediction.toString();
    }
}
