public class MySQLTableCreator {
    public static void main(String args[]) {
//        MySQLConnector.updateData("CREATE TABLE users (\n" +
//                "    user LONG,\n" +
//                "    language varchar(255),\n" +
//                "    predicTheme varchar(255),\n" +
//                "    novelPos varchar(255)\n" +
//                ");");
//        MySQLConnector.updateData("INSERT INTO users (user, language, predicTheme, novelPos)" +
//                " VALUES ('1242','null','null','null')");
//        MySQLConnector.updateData("INSERT INTO users (user, language, predicTheme, novelPos)" +
//                " VALUES ('23442','null','null','null')");
//        MySQLConnector.updateData("DELETE FROM users WHERE user > 1");
        String input = MySQLConnector.retrieveData("SELECT user FROM users");
        System.out.println(input);
    }
}
