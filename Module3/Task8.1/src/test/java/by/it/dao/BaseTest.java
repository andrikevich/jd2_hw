package by.it.dao;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.dbunit.DatabaseUnitException;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.ext.mysql.MySqlConnection;
import org.dbunit.operation.DatabaseOperation;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;

public abstract class BaseTest {
    SessionFactory factory;
    private final static Logger log = Logger.getLogger(BaseTest.class.getName());

    @Before
    public void setUp() {
        final StandardServiceRegistry standardServiceRegistry
                = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.test.xml")
                .build();

        factory = new MetadataSources(standardServiceRegistry)
                .buildMetadata()
                .buildSessionFactory();
    }

    @After
    public void tearDown() {
        factory.close();

    }


    private IDatabaseConnection connection;
    private IDataSet dataSet;

    public void cleanInsert(String resourceName) {
        try {
            if (connection == null) {
                connection = new MySqlConnection(
                        DataSourceReceiver.getConnectionToTestDb(),
                        "jpa_test");
            }
            dataSet = new FlatXmlDataSetBuilder().build(BaseTest.class
                    .getResourceAsStream(resourceName));
            DatabaseOperation.CLEAN_INSERT.execute(connection, dataSet);
        } catch (SQLException | DatabaseUnitException e) {
            log.log(Level.SEVERE, e.getMessage(), e);
        }
    }

    public void deleteDataset() {
        try {
            DatabaseOperation.DELETE.execute(connection, dataSet);
            connection.close();
        } catch (SQLException | DatabaseUnitException e) {
            log.log(Level.SEVERE, e.getMessage(), e);
        }
    }
    

   

}
