import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ZodiacPredictionBot2 {
    private static Map<String, String> zodiacFacts;

    public static void main(String[] args) {
        initializeZodiacFacts();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть свій знак зодіаку: ");
        String zodiacSign = scanner.nextLine();

        if (zodiacFacts.containsKey(zodiacSign)) {
            System.out.print("Бажаєте отримати цікавий факт про свій знак зодіаку? (так/ні): ");
            String answer = scanner.nextLine().toLowerCase();

            if (answer.equals("да")) {
                String fact = zodiacFacts.get(zodiacSign);
                System.out.println("Цікавий факт про знак зодіаку " + zodiacSign + ": " + fact);
            } else {
                System.out.println("Добре немає проблем!");
            }
        } else {
            System.out.println("Некоректний знак зодіаку!");
        }

        scanner.close();
    }

    private static void initializeZodiacFacts() {
        zodiacFacts = new HashMap<>();

        zodiacFacts.put("Овен", "Цікавий факт про Овна...");
        zodiacFacts.put("Телець", "Цікавий факт про Тільця...");
        // Потім додам всі інші знаки зодіаку та їх факти
    }
}

