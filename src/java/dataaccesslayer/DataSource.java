package dataaccesslayer;

import java.sql.Connection;

public class DataSource {

    private Connection connection = null;
    // TODO:  Initialize the url string variable properly.  No need to load the
    //        JDBC URL, username, and password from a properties file.
    private final String url = "a JDBC URL here";
    private String username = "CST8288";
    private String password = "CST8288";

    public DataSource() {
    }

    /*
     * Only use one connection for this application, prevent memory leaks.
     */
    public Connection createConnection() {
        // TODO:  Add your code here.  Make sure to use try-catch statement.
        //        Make sure there is only one connection for this application
        //        to prevent memory leaks.
    }

}
