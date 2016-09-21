
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MySqlConnection {

    private Connection conn;
    private static final String PASSWORD = "root";

    public MySqlConnection(String dbName) {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + dbName, "root", PASSWORD);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Conneciton to database failed!\nExiting application", "Fatal error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            System.exit(0);
        }
    }

    private Statement createStatementAndExecute(String sql) throws SQLException {
        Statement stmt = conn.createStatement();
        stmt.execute(sql);
        return stmt;
    }

    public ResultSet query(String sql) throws SQLException {
        return createStatementAndExecute(sql).getResultSet();
    }

    public void update(String sql) throws SQLException {
        createStatementAndExecute(sql);
    }

}
