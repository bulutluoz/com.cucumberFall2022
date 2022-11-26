package utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBUtils {
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;
    //BU METHOD COK KULLANACAGIZ
    //createConnection database e baglanmak icin. Burda url, username, password u kullanarak database baglaniyoruz
    //Database e ne zaman baglanmak isterse bu methodu cagrabiliriz
    //Bu method u data cok BeforeMethod icinde setup icin kullanacagiz

    public static void createConnection(){
        String url="jdbc:mysql://sql748.main-hosting.eu:3306/u480337000_jdbc_data";
        String username="u480337000_jdbc_user";
        String password="4Ob8Y]DJU/f";

        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {

            System.out.println("Connection kurulamadi");
        }
    }

    //BU METHODU COK KULLANACAGIZ
    //Bu method DatabaDBUTilsse e baglandiktan sonra Yazilan query yi calistirmak icin
    //Bu method da statement ve resultset objesini olusturup query run ediyoruz
    public static void executeQuery(String query) {
        try {
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException e) {

            System.out.println("SQL sorgusu ayarlari yapilamadi");
        }
        try {
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {

            System.out.println("SQL sorgusu calistirilamadi");
        }
    }


    //Database baglantisini sonlandirmak icin. Bu Mehtod u test tamamladiktan sonra kullaniriz
    public static void closeConnection() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //Sonraki 3 methodu sadece connection,statement,resultset kullanmak istedigimizde kullaniriz
    //connection =>DBUtils.getConnection()
    //statement => DBUtils.getResultset()
    //resultSet => DBUtils.getResultset()
    //getStatement method statement object i olusturmak icin
    public static Statement getStatement() {
        try {
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return statement;
    }
    //getConnection method Connection object i olusturmak icin. Bu method create createConnectiondan farkli olarak connection objesi return ediyor
    public static Connection getConnection() {
        String url="jdbc:mysql://sql748.main-hosting.eu:3306/u480337000_jdbc_data";
        String username="u480337000_jdbc_user";
        String password="4Ob8Y]DJU/f";
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.out.println("Connection saglanamadi");
        }
        return connection;
    }
    //getResultset method Resultset object i olusturmak icin.
    public static ResultSet getResultset() {
        try {
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return resultSet;
    }
    //Table da kac satir var
    public static int getRowCount() throws Exception {
        resultSet.last();
        int rowCount = resultSet.getRow();
        return rowCount;
    }
    /**
     * @return returns a single cell value. If the results in multiple rows and/or
     *         columns of data, only first column of the first row will be returned.
     *         The rest of the data will be ignored
     */
    public static Object getCellValue(String query) {
        return getQueryResultList(query).get(0).get(0);
    }
    /**
     * @return returns a list of Strings which represent a row of data. If the query
     *         results in multiple rows and/or columns of data, only first row will
     *         be returned. The rest of the data will be ignored
     */
    public static List<Object> getRowList(String query) {
        return getQueryResultList(query).get(0);
    }
    /**
     * @return returns a map which represent a row of data where key is the column
     *         name. If the query results in multiple rows and/or columns of data,
     *         only first row will be returned. The rest of the data will be ignored
     */
    public static Map<String, Object> getRowMap(String query) {
        return getQueryResultMap(query).get(0);
    }
    /**
     * @return returns query result in a list of lists where outer list represents
     *         collection of rows and inner lists represent a single row
     */
    public static List<List<Object>> getQueryResultList(String query) {
        executeQuery(query);
        List<List<Object>> rowList = new ArrayList<>();
        ResultSetMetaData rsmd;
        try {
            rsmd = resultSet.getMetaData();
            while (resultSet.next()) {
                List<Object> row = new ArrayList<>();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    row.add(resultSet.getObject(i));
                }
                rowList.add(row);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rowList;
    }
    /**
     * @return list of values of a single column from the result set
     */
    public static List<Object> getColumnData(String query, String column) {
        executeQuery(query);
        List<Object> rowList = new ArrayList<>();
        ResultSetMetaData rsmd;
        try {
            rsmd = resultSet.getMetaData();
            while (resultSet.next()) {
                rowList.add(resultSet.getObject(column));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rowList;
    }
    /**
     * @return returns query result in a list of maps where the list represents
     *         collection of rows and a map represents represent a single row with
     *         key being the column name
     */
    public static List<Map<String, Object>> getQueryResultMap(String query) {
        executeQuery(query);
        List<Map<String, Object>> rowList = new ArrayList<>();
        ResultSetMetaData rsmd;
        try {
            rsmd = resultSet.getMetaData();
            while (resultSet.next()) {
                Map<String, Object> colNameValueMap = new HashMap<>();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    colNameValueMap.put(rsmd.getColumnName(i), resultSet.getObject(i));
                }
                rowList.add(colNameValueMap);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rowList;
    }
    /*
     * @return List of columns returned in result set
     */
    public static List<String> getColumnNames(String query) {
        executeQuery(query);
        List<String> columns = new ArrayList<>();
        ResultSetMetaData rsmd;
        try {
            rsmd = resultSet.getMetaData();
            int columnCount = rsmd.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                columns.add(rsmd.getColumnName(i));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return columns;
    }

}
