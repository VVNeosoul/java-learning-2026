import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeSelect {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/employees";
        String user = "root";
        String password = "080109";

        String sql =
                "SELECT id, name, age, salary FROM employees";

        try (
                Connection connection =
                        DriverManager.getConnection(url, user, password);

                Statement statement =
                        connection.createStatement();

                ResultSet resultSet =
                        statement.executeQuery(sql)
        ) {

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                int salary = resultSet.getInt("salary");

                System.out.println(
                        id + " / "
                                + name + " / "
                                + age + " / "
                                + salary
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}