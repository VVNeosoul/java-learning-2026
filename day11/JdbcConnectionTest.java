import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnectionTest {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/employees";
        String user = "root";
        String password = "080109";

        try {
            Connection connection =
                    DriverManager.getConnection(url, user, password);

            System.out.println("数据库连接成功！");

            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}