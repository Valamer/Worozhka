import com.mysql.jdbc.ResultSetMetaData;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class MySQLConnector {
    static Properties prop;

    static {
        try {
            prop = ReadPropertiesFile.readPropertiesFile("config.properties");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // JDBC URL, username and password of MySQL server
        private static final String url = prop.getProperty("database.url");
        private static final String user = prop.getProperty("database.user");
        private static final String password = prop.getProperty("database.password");

        // JDBC variables for opening and managing connection
        private static Connection con;
        private static Statement stmt;
        private static ResultSet rs;

    public static String retrieveData(String statement) {
            String result = "";
            try {
                // opening database connection to MySQL server
                con = DriverManager.getConnection(url, user, password);

                // getting Statement object to execute query
                stmt = con.createStatement();

                // executing query

                rs = stmt.executeQuery(statement);
                ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
                int numberOfColumn = rsmd.getColumnCount();
                while (rs.next()) {
                    if (!result.equals("")){result = result + "\n";}
                    for (int i = 1; i <= numberOfColumn; i++) {
                        if(i == 1) {
                            result = result + rs.getString(i);
                        }
                        else {
                            result = result + ";" + rs.getString(i);
                        }
                    }
                }

            } catch (SQLException sqlEx) {
                sqlEx.printStackTrace();
            } finally {
                //close connection ,stmt and resultset here
                try { con.close(); } catch(SQLException se) { /*can't do anything */ }
                try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
                try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
            }
            return result;
        }

    public static void updateData(String statement) {

        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // executing query

            stmt.execute(statement);

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
        }
    }

}

