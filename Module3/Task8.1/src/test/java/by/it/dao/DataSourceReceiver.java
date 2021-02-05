package by.it.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataSourceReceiver {
	
    private final static Logger log = Logger.getLogger(DataSourceReceiver.class.getName());
    private static Properties properties = new Properties();

    static {
        try {
            properties.load(DataSourceReceiver.class
                    		.getResourceAsStream("/person-test-db.properties"));
            
            Class.forName(properties.getProperty("jdbc.drivers"));
        } catch (ClassNotFoundException | IOException e) {
            log.log(Level.SEVERE, e.getMessage(), e);
        }
    }

    public static Connection getConnectionToTestDb() throws SQLException {
    	Connection connection =  DriverManager.getConnection(
				                properties.getProperty("url"),
				                properties);
        return connection;
    }

}
