import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendSticker;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Bot extends TelegramLongPollingBot {
    private int startday;
    private int language;
    private int predicTheme;
    private String novelPos;
    private String novelVarA;
    private String novelVarB;
    private String novelVarC;
    private int[] zodiak_code = get_zodiak_code();

    public void setStartday(int startday) {
        this.startday = startday;
    }


    public String getBotToken() {
        return "5202332329:AAF6yeC4ASl_pKwKCxUbXBNOhaxfRXQEx3g";
    }
    public String getBotUsername() {
        return "vorozhkaBot";
    }


    public void sendMsg(Message message, String text){ //метод для отправки сообщений
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);

        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText(text);

        try {
            execute(sendMessage); //отправка сообщения
        } catch (TelegramApiException e){
            e.printStackTrace(); //если не отправлено, бот выдает ошибку
        }
    }
    public void keyboard2x0(Message message,String text, String keyOne, String keyTwo){
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);

        ReplyKeyboardMarkup replyKeyboardMarkup = new
                ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add(keyOne);
        keyboardFirstRow.add(keyTwo);

        keyboard.add(keyboardFirstRow);
        replyKeyboardMarkup.setKeyboard(keyboard);

        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText(text);
        try {
            execute(sendMessage); //отправка сообщения
        } catch (TelegramApiException e1){
            e1.printStackTrace(); //если не отправлено, бот выдает ошибку
        }
    }
    public void keyboard2x1(Message message,String text, String keyOne, String keyTwo, String keyThree){
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);

        ReplyKeyboardMarkup replyKeyboardMarkup = new
                ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add(keyOne);
        keyboardFirstRow.add(keyTwo);
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        keyboardSecondRow.add(keyThree);

        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardSecondRow);
        replyKeyboardMarkup.setKeyboard(keyboard);

        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText(text);
        try {
            execute(sendMessage); //отправка сообщения
        } catch (TelegramApiException e1){
            e1.printStackTrace(); //если не отправлено, бот выдает ошибку
        }
    }
    public void keyboard2x2(Message message,String text, String keyOne, String keyTwo, String keyThree, String keyFour){
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);

        ReplyKeyboardMarkup replyKeyboardMarkup = new
                ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add(keyOne);
        keyboardFirstRow.add(keyTwo);
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        keyboardSecondRow.add(keyThree);
        keyboardSecondRow.add(keyFour);

        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardSecondRow);
        replyKeyboardMarkup.setKeyboard(keyboard);

        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText(text);
        try {
            execute(sendMessage); //отправка сообщения
        } catch (TelegramApiException e1){
            e1.printStackTrace(); //если не отправлено, бот выдает ошибку
        }
    }
    public void keyboard2x3(Message message, String text, String keyOne, String keyTwo, String keyThree, String keyFour, String keyFive){
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);

        ReplyKeyboardMarkup replyKeyboardMarkup = new
                ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add(keyOne);
        keyboardFirstRow.add(keyTwo);
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        keyboardSecondRow.add(keyThree);
        keyboardSecondRow.add(keyFour);
        keyboardSecondRow.add(keyFive);

        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardSecondRow);
        replyKeyboardMarkup.setKeyboard(keyboard);

        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText(text);
        try {
            execute(sendMessage); //отправка сообщения
        } catch (TelegramApiException e1){
            e1.printStackTrace(); //если не отправлено, бот выдает ошибку
        }
    }
    public void keyboard3x0(Message message, String text, String keyOne, String keyTwo, String keyThree){
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);

        ReplyKeyboardMarkup replyKeyboardMarkup = new
                ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add(keyOne);
        keyboardFirstRow.add(keyTwo);
        keyboardFirstRow.add(keyThree);

        keyboard.add(keyboardFirstRow);
        replyKeyboardMarkup.setKeyboard(keyboard);

        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText(text);
        try {
            execute(sendMessage); //отправка сообщения
        } catch (TelegramApiException e1){
            e1.printStackTrace(); //если не отправлено, бот выдает ошибку
        }
    }
    public void keyboard3x1(Message message, String text, String keyOne, String keyTwo, String keyThree, String keyFour){
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);

        ReplyKeyboardMarkup replyKeyboardMarkup = new
                ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add(keyOne);
        keyboardFirstRow.add(keyTwo);
        keyboardFirstRow.add(keyThree);
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        keyboardSecondRow.add(keyFour);

        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardSecondRow);
        replyKeyboardMarkup.setKeyboard(keyboard);

        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText(text);
        try {
            execute(sendMessage); //отправка сообщения
        } catch (TelegramApiException e1){
            e1.printStackTrace(); //если не отправлено, бот выдает ошибку
        }
    }
    public void keyboard3x2(Message message, String text, String keyOne, String keyTwo, String keyThree, String keyFour, String keyFive){
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);

        ReplyKeyboardMarkup replyKeyboardMarkup = new
                ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add(keyOne);
        keyboardFirstRow.add(keyTwo);
        keyboardFirstRow.add(keyThree);
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        keyboardSecondRow.add(keyFour);
        keyboardSecondRow.add(keyFive);

        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardSecondRow);
        replyKeyboardMarkup.setKeyboard(keyboard);

        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText(text);
        try {
            execute(sendMessage); //отправка сообщения
        } catch (TelegramApiException e1){
            e1.printStackTrace(); //если не отправлено, бот выдает ошибку
        }
    }
    public void keyboard3x3(Message message, String text, String keyOne, String keyTwo, String keyThree, String keyFour, String keyFive, String keySix){
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);

        ReplyKeyboardMarkup replyKeyboardMarkup = new
                ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add(keyOne);
        keyboardFirstRow.add(keyTwo);
        keyboardFirstRow.add(keyThree);
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        keyboardSecondRow.add(keyFour);
        keyboardSecondRow.add(keyFive);
        keyboardSecondRow.add(keySix);

        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardSecondRow);
        replyKeyboardMarkup.setKeyboard(keyboard);

        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText(text);
        try {
            execute(sendMessage); //отправка сообщения
        } catch (TelegramApiException e1){
            e1.printStackTrace(); //если не отправлено, бот выдает ошибку
        }
    }
    public void keyboard2x1x1(Message message,String text, String keyOne, String keyTwo, String keyThree, String keyFour){
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);

        ReplyKeyboardMarkup replyKeyboardMarkup = new
                ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add(keyOne);
        keyboardFirstRow.add(keyTwo);
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        keyboardSecondRow.add(keyThree);
        KeyboardRow keyboardThirdRow = new KeyboardRow();
        keyboardThirdRow.add(keyFour);

        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardSecondRow);
        keyboard.add(keyboardThirdRow);
        replyKeyboardMarkup.setKeyboard(keyboard);

        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText(text);
        try {
            execute(sendMessage); //отправка сообщения
        } catch (TelegramApiException e1){
            e1.printStackTrace(); //если не отправлено, бот выдает ошибку
        }
    }
    public void keyboard2x1x1x1(Message message,String text, String keyOne, String keyTwo, String keyThree, String keyFour, String keyFive){
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);

        ReplyKeyboardMarkup replyKeyboardMarkup = new
                ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboard = new ArrayList<>();

        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add(keyOne);
        keyboardFirstRow.add(keyTwo);
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        keyboardSecondRow.add(keyThree);
        KeyboardRow keyboardThirdRow = new KeyboardRow();
        keyboardThirdRow.add(keyFour);
        KeyboardRow keyboardFourthRow = new KeyboardRow();
        keyboardFourthRow.add(keyFive);

        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardSecondRow);
        keyboard.add(keyboardThirdRow);
        keyboard.add(keyboardFourthRow);
        replyKeyboardMarkup.setKeyboard(keyboard);

        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText(text);
        try {
            execute(sendMessage); //отправка сообщения
        } catch (TelegramApiException e1){
            e1.printStackTrace(); //если не отправлено, бот выдает ошибку
        }
    }
    public void sendSti(Message message, String stickerId){
        InputFile sticker = new InputFile();
        sticker.setMedia(stickerId);
        SendSticker sendSticker = new SendSticker();
        sendSticker.setChatId(message.getChatId().toString());
        sendSticker.setSticker(sticker);

        try {
            execute(sendSticker);
        } catch (TelegramApiException e){
            e.printStackTrace();
        }
    }
    public int[] get_zodiak_code(){
        GetMassive getMassive = new GetMassive();
        return getMassive.getZodiak_code();
    }

    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        System.out.println(message.getChat().getFirstName() + " " + message.getChat().getLastName() + " воспользовался ботом");
        String[] massive;
        String input = message.getText();
        input = input.substring(0, 1).toUpperCase() + input.substring(1);
        System.out.println(input);
        Random rnd = new Random();

        GetNowDate getNowDate = new GetNowDate();
        int nowdate = getNowDate.getNow();

        try{
            massive = input.split("; ");
            String first = massive[0];
            String second = massive[1];

            first = first.substring(0, 1).toUpperCase() + first.substring(1);
            second = second.substring(0, 1).toUpperCase() + second.substring(1);

            System.out.println("Совместимость " + first + " и " + second);
            if (first.equals(second))
            {
                if (language == 1)
                {
                    sendSti(message, "CAACAgQAAxkBAAEI6MhkWTmv7_8k42nNSNnu-VIFu29lEAACPgwAAp3eWVBGHn6omULBrS8E");
                    sendMsg(message, "Вы лохи, не подходите друг друг");
                }
                if (language == 2)
                {
                    sendSti(message, "CAACAgQAAxkBAAEI6MhkWTmv7_8k42nNSNnu-VIFu29lEAACPgwAAp3eWVBGHn6omULBrS8E");
                    sendMsg(message, "You fools, don't approach each other");
                }
                if (language != 1 && language != 2  ){
                    sendSti(message, "CAACAgIAAxkBAAEI6PlkWUtwqhGQu_3q5RynqbDMXoCP9AACYhUAAiK6eUnZlk2-IN3yIS8E");
                    keyboard2x0(message, "Before starting to fully use the bot,please select your language. \n" +
                            "Перед початком повноцінного використання бота, будь ласка, оберіть свою мову",
                            "Українська","English");
                    System.out.println("Не обрана мова/Not selected language");
                }
            }
            else {
                if (language == 1) {
                    sendSti(message, "CAACAgQAAxkBAAEI6MhkWTmv7_8k42nNSNnu-VIFu29lEAACPgwAAp3eWVBGHn6omULBrS8E");
                    sendMsg(message, "Ваша совместимость:" + rnd.nextInt(-100, 100) + "%");
                }
                if (language == 2) {
                    sendSti(message, "CAACAgQAAxkBAAEI6MhkWTmv7_8k42nNSNnu-VIFu29lEAACPgwAAp3eWVBGHn6omULBrS8E");
                    sendMsg(message, "Your compatibility:" + rnd.nextInt(-100, 100) + "%");
                }
                if (language != 1 && language != 2){
                    sendSti(message, "CAACAgIAAxkBAAEI6PlkWUtwqhGQu_3q5RynqbDMXoCP9AACYhUAAiK6eUnZlk2-IN3yIS8E");
                    keyboard2x0(message, "Before starting to fully use the bot,please select your language. \n" +
                                    "Перед початком повноцінного використання бота, будь ласка, оберіть свою мову",
                            "Українська","English");
                    System.out.println("Не обрана мова/Not selected language");
                }
            }
        } catch(ArrayIndexOutOfBoundsException e) {

            int n=12;
            int zodiak_num = 0;
            if (nowdate != startday) {
                 zodiak_code = new int[n];
                for (int i = 0; i < n; i++) {
                    zodiak_code[i] = rnd.nextInt(0, 16);
                }
                startday = nowdate;
            }
            System.out.println("now +" + nowdate);
            System.out.println("start +" + startday);

            switch (input) {
                case "/start", "Змінити мову/Change language" -> {
                    System.out.println("Вибір мови/language selection");

                    sendSti(message, "CAACAgIAAxkBAAEI6PlkWUtwqhGQu_3q5RynqbDMXoCP9AACYhUAAiK6eUnZlk2-IN3yIS8E");
                    keyboard2x0(message,"Будь ласка, для початку, оберіть мову","Українська","English" );
                    sendMsg(message, "Please select a language first");

                    zodiak_num=-1;
                }
                case "Українська", "Головне Меню" -> {
                    System.out.println("Ви в головному меню");
                    language = 1;
                    keyboard3x1(message, "Ви в головному меню","Передбачення","Сумісність",
                            "Запустити Новелу","Змінити мову/Change language");
                    zodiak_num=-1;
                }
                case "English", "Main Menu" -> {
                    System.out.println("You are in main menu");
                    language = 2;
                    keyboard3x1(message, "You are in main menu","Prediction","Compatibility",
                            "Run Novel","Змінити мову/Change language");
                    zodiak_num=-1;
                }
                case "Передбачення", "Prediction" -> {
                    if(language == 1) {
                        System.out.println("Розділ Передбачень");
                        keyboard3x1(message,"Ви в розділі передбачень. Для того щоб дізнатися своє передбачення, оберіть цікаву " +
                                "вам тему та напишіть свій знак зодіаку українською, російською або англійською.\n" +
                                "Наприклад: \"Терези\", \"Cancer\", \"стрелец\". ","Фінанси",
                                "Кар'єра","Кохання","Головне Меню");
                        zodiak_num = -1;
                    }
                    if(language == 2){
                        System.out.println("Predictions Section");
                        keyboard3x1(message,"You are in the prediction section. In order to find out your prediction," +
                                        " choose a topic that interests you and write your zodiac sign in Ukrainian, Russian or English.\n" +
                                        "For example: \"Терези\", \"Cancer\", \"Стрелец\". ","Finance",
                                "Career","Love","Main Menu");
                        zodiak_num=-1;
                    }
                }
                case "Сумісність", "Compatibility" -> {
                    if (language == 1) {
                        sendMsg(message, "Щоб дізнатися сумісність напишіть два зодіаки або імені через крапку з комою " +
                                "(після крапки з комою ставте пробіл, Ви ж грамотна людина). \n" +
                                "Наприклад: \"Іван, Маруся\", \"Libra, leo\". \n" +
                                "Бажаю успіху у пророкуванні))");
                    }
                    if (language == 2){
                        sendMsg(message,"To find out compatibility, write two zodiac signs or names separated by a semicolon " +
                                "(put a space after the semicolon, you are a literate person, after all).\n" +
                                "For example: \"Іван, Маруся\", \"Libra, leo\". \n" +
                                "I wish you success in predicting))");
                    }
                    zodiak_num = -1;
                }
                case "Finance", "Фінанси" -> {
                    if(language==1){
                        System.out.println("Обрана тематика фінансів");
                        sendMsg(message, "Обрана тематика фінансів");
                    }
                    if(language==2){
                        System.out.println("Selected topic of finance");
                        sendMsg(message, "Selected topic of finance");
                    }
                    predicTheme = 1;
                    zodiak_num=-1;
                }
                case "Career", "Кар'єра" -> {
                    if(language==1){
                        System.out.println("Обрана тематика кар'єри");
                        sendMsg(message, "Обрана тематика кар'єри");
                    }
                    if(language==2){
                        System.out.println("Selected topic of career");
                        sendMsg(message, "Selected topic of career");
                    }
                    predicTheme = 2;
                    zodiak_num=-1;
                }
                case "Love", "Кохання" -> {
                    if(language==1){
                        System.out.println("Обрана тематика кохання");
                        sendMsg(message, "Обрана тематика кохання");
                    }
                    if(language==2){
                        System.out.println("Selected topic of love");
                        sendMsg(message, "Selected topic of love");
                    }
                    predicTheme = 3;
                    zodiak_num=-1;
                }
                case "Запустити Новелу", "Run Novel" -> {
                    if (novelPos == null) {
                        novelPos = "S";
                        novelVarA = "Вишукане немовлятко з очами-загадками та вогнем-душею.";
                        novelVarB = "Звичайне середньостатистичне дитятко.";
                        novelVarC = null;
                    }
                    Novel novel = new Novel(novelPos, novelVarA, novelVarB, novelVarC);
                    if (novelVarB == null ) {
                        keyboard2x1(message, novel.mainText(novelPos),"Головне Меню","Почати Спочатку",
                                novelVarA);
                    }
                    if (novelVarB != null && novelVarC == null) {
                        keyboard2x2(message, novel.mainText(novelPos),"Головне Меню","Почати Спочатку",
                                novelVarA, novelVarB);
                    }
                    if (novelVarC != null) {
                        keyboard2x3(message, novel.mainText(novelPos),"Головне Меню","Почати Спочатку",
                                novelVarA, novelVarB, novelVarC);
                    }
                    zodiak_num=-1;
                }
                case "Почати Спочатку" -> {
                    novelPos = "S";
                    novelVarA = "Вишукане немовлятко з очами-загадками та вогнем-душею.";
                    novelVarB = "Звичайне середньостатистичне дитятко.";
                    novelVarC = null;
                    Novel novel = new Novel(novelPos, novelVarA, novelVarB, null);
                    keyboard2x1x1(message, novel.mainText(novelPos),"Головне Меню","Почати Спочатку",
                            novelVarA, novelVarB);
                    zodiak_num=-1;
                }
                case "Aries", "Овен" -> {
                    System.out.println("Гороскоп для овна");
                    zodiak_num = zodiak_code[0];
                }
                case "Taurus", "Телец", "Телець" -> {
                    System.out.println("Гороскоп для тельца");
                    zodiak_num = zodiak_code[1];
                }
                case "Gemini", "Близнецы", "Близнюки" -> {
                    System.out.println("Гороскоп для близнецов");
                    zodiak_num = zodiak_code[2];
                }
                case "Cancer", "Рак" -> {
                    System.out.println("Горсокоп для раков");
                    zodiak_num = zodiak_code[3];
                }
                case "Leo", "Лев" -> {
                    System.out.println("Гороскоп для львов");
                    zodiak_num = zodiak_code[4];
                }
                case "Virgo", "Дева", "Діва" -> {
                    System.out.println("Гороскоп для дев");
                    zodiak_num = zodiak_code[5];
                }
                case "Libra", "Весы", "Терези" -> {
                    System.out.println("Гороскоп для весов");
                    zodiak_num = zodiak_code[6];
                }
                case "Scorpio", "Скорпион", "Скорпіон" -> {
                    System.out.println("Гороскоп для скорпионов");
                    zodiak_num = zodiak_code[7];
                }
                case "Sagittarius", "Стрелец", "Стрілець" -> {
                    System.out.println("Гороскоп для стрельцов");
                        zodiak_num = zodiak_code[8];
                }
                case "Capricorn", "Козерог", "Козеріг" -> {
                    System.out.println("Гороскоп для водолеев");
                    zodiak_num = zodiak_code[9];
                }
                case "Aquarius", "Водолей", "Водолій" -> {
                    System.out.println("Гороскоп для водолеев");
                    zodiak_num = zodiak_code[10];
                }
                case "Pisces", "Рыбы", "Риби" -> {
                    System.out.println("Гороскоп для рыб");
                    zodiak_num = zodiak_code[11];
                }
                case "Сброс" -> {
                    language = 0;
                    predicTheme = 0;
                }
                default -> zodiak_num=-2;
            }
            if (input.equals(novelVarA) || input.equals(novelVarB) || input.equals(novelVarC)) {

                System.out.println("Функція запущена");
                System.out.println(novelPos);
                System.out.println(novelVarA);
                System.out.println(novelVarB);
                System.out.println(novelVarC);

                Novel novel = new Novel(novelPos, novelVarA, novelVarB, novelVarC);

                //Зміна позиції в новелі у відповідності з обраним варіантом
                if (input.equals(novelVarA) && !novelVarA.equals("Далі")) {
                    novelPos = novel.switchPos("A",novelPos);
                    System.out.println("Вибір А");
                }
                if (input.equals(novelVarB)) {
                    novelPos = novel.switchPos("B",novelPos);
                    System.out.println("Вибір В");
                }
                if (input.equals(novelVarC)) {
                    novelPos = novel.switchPos("C",novelPos);
                    System.out.println("Вибір С");
                }
                if (input.equals(novelVarA) && novelVarA.equals("Далі")) {
                    novelPos = novel.switchPos("Next",novelPos);
                    System.out.println("Вибір Далі");
                }

                if (novel.finalCheck(novelPos)){
                    novelPos = "S";
                    novel.setPos("S");
                    novelVarA = novel.getChooseA(novelPos);
                    novelVarB = novel.getChooseB(novelPos);
                    novelVarC = novel.getChooseC(novelPos);
                    keyboard2x0(message,"Ось і кінець. Дякую за проходження новели!" +
                            " Можете спробувати почати спочатку та обрати інший шлях",
                            "Головне Меню","Почати Спочатку");
                    System.out.println("Кінець");
                }
                else {
                    System.out.println("Не кінець");

                    //В новелі є декілька випадків, коли ми повертаємося назад у виборі чи стрибаємо на іншу гілку
                    novelPos = novel.loopCheck(novelPos);

                    //Знаходимо значення для варіантів вибору
                    novelVarA = novel.getChooseA(novelPos);
                    novelVarB = novel.getChooseB(novelPos);
                    novelVarC = novel.getChooseC(novelPos);

                    System.out.println("Присвоєні варіанти");

                    //Виведення текста необхідного варіанту та створення інтерфейсу для нових виборів
                    if (novelVarB == null) {
                        System.out.println("Спроба вивести клавіатуру 2x1");
                        keyboard2x1(message, novel.mainText(novelPos), "Головне Меню", "Почати Спочатку",
                                novelVarA);
                        System.out.println("Клавіатуру 2x1 виведено");
                    }
                    if (novelVarB != null && novelVarC == null) {
                        System.out.println("Спроба вивести клавіатуру 2x1x1");
                        keyboard2x1x1(message, novel.mainText(novelPos), "Головне Меню", "Почати Спочатку",
                                novelVarA, novelVarB);
                        System.out.println("Клавіатуру 2x1x1 виведено");
                    }
                    if (novelVarC != null) {
                        System.out.println("Спроба вивести клавіатуру 2x1x1x1");
                        keyboard2x1x1x1(message, novel.mainText(novelPos), "Головне Меню", "Почати Спочатку",
                                novelVarA, novelVarB, novelVarC);
                        System.out.println("Клавіатуру 2x1x1x1 виведено");
                    }

                }

                System.out.println(novelPos);
                System.out.println(novelVarA);
                System.out.println(novelVarB);
                System.out.println(novelVarC);

                zodiak_num = -1;
            }

            if (language != 2 && language != 1 && !input.equals("/start") && !input.equals("Змінити мову/Change language"))
            {
                sendSti(message, "CAACAgIAAxkBAAEI6PlkWUtwqhGQu_3q5RynqbDMXoCP9AACYhUAAiK6eUnZlk2-IN3yIS8E");
                keyboard2x0(message, "Before starting to fully use the bot,please select your language. \n" +
                                "Перед початком повноцінного використання бота, будь ласка, оберіть свою мову",
                        "Українська","English");
                System.out.println("Не обрана мова/Not selected language");
                zodiak_num = -1;
            }

            if (zodiak_num>=0 && predicTheme<=0) {
                if(language == 1){
                    sendSti(message, "CAACAgIAAxkBAAEI6PlkWUtwqhGQu_3q5RynqbDMXoCP9AACYhUAAiK6eUnZlk2-IN3yIS8E");
                    sendMsg(message, "Перед тим як отримати передбачення, будь ласка, оберіть його тематику");
                    System.out.println("Не обрана тематика");
                }
                if(language == 2){
                    sendSti(message, "CAACAgIAAxkBAAEI6PlkWUtwqhGQu_3q5RynqbDMXoCP9AACYhUAAiK6eUnZlk2-IN3yIS8E");
                    sendMsg(message, "Before receiving a prediction, please select its theme");
                    System.out.println("Not selected theme");
                }
            }

            if (zodiak_num>=0 && predicTheme>0) {
                FilePredict filePredict = new FilePredict(zodiak_num, language, predicTheme);
                System.out.println(zodiak_num);
                sendSti(message, "CAACAgQAAxkBAAEI6MhkWTmv7_8k42nNSNnu-VIFu29lEAACPgwAAp3eWVBGHn6omULBrS8E");
                sendMsg(message, filePredict.getPredict());
            }

            if (zodiak_num == -2){
                if (language == 1) {
                    sendSti(message, "CAACAgIAAxkBAAEI6PlkWUtwqhGQu_3q5RynqbDMXoCP9AACYhUAAiK6eUnZlk2-IN3yIS8E");
                    sendMsg(message, "Помутніння в астралі... Ти мене обманюєш, хотів написати щось інше!");
                    System.out.println("Помутніння в астралі... Ти мене обманюєш, хотів написати щось інше!");
                }
                if (language == 2) {
                    sendSti(message, "CAACAgIAAxkBAAEI6PlkWUtwqhGQu_3q5RynqbDMXoCP9AACYhUAAiK6eUnZlk2-IN3yIS8E");
                    sendMsg(message, "Cloudiness in the astral... You are deceiving me, I wanted to write something else!!!");
                    System.out.println("Cloudiness in the astral... You are deceiving me, I wanted to write something else!!!");
                }
            }
        }
    }
}
