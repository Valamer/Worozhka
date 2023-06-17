public class MySQLCommands {

    public static void addUser (Long chatId){
        MySQLConnector.updateData("INSERT INTO users (user, language, predicTheme, novelPos)" +
                " VALUES ('" + chatId + "','null','null','null')");
    }
    public static void updateLanguage (String language, Long chatId){
        MySQLConnector.updateData("UPDATE users \n" +
                "SET language = '"+ language +"' \n" +
                "WHERE user = '"+ chatId +"';");
    }
    public static void updatePredicTheme (String predicTheme, Long chatId){
        MySQLConnector.updateData("UPDATE users \n" +
                "SET predicTheme = '"+ predicTheme +"' \n" +
                "WHERE user = '"+ chatId +"';");
    }
    public static void updateNovelPos (String novelPos, Long chatId){
        MySQLConnector.updateData("UPDATE users \n" +
                "SET novelPos = '"+ novelPos +"' \n" +
                "WHERE user = '"+ chatId +"';");
    }

    public static Boolean checkUser (Long chatId){
        String input = MySQLConnector.retrieveData("SELECT user FROM users");
        String[] massive = input.split("\n");
        for(String s: massive){
            if(s.equals(chatId.toString())){return true;}
        }
        return  false;
    }
    public static String getLanguage (Long chatId){
        return MySQLConnector.retrieveData("SELECT language FROM users WHERE user = '" + chatId + "'");
    }
    public static String getPredicTheme (Long chatId){
        return MySQLConnector.retrieveData("SELECT predicTheme FROM users WHERE user = '" + chatId + "'");
    }
    public static String getNovelPos (Long chatId){
        return MySQLConnector.retrieveData("SELECT novelPos FROM users WHERE user = '" + chatId + "'");
    }
}
