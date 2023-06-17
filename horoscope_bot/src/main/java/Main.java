import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {
    public static void main(String[] args) {
        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            Bot bot = new Bot();
            GetStartDate gsd = new GetStartDate();
            int startday = gsd.getStart();
            bot.setStartday(startday);
            botsApi.registerBot(bot);     // запускаем бота
            System.out.println("Юхууу, мы работаем, девачки!!!");
        } catch (TelegramApiException e) {
            e.printStackTrace(); // если не запускается, выдает ошибку
        }
    }
}