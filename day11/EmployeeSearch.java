import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeSearch {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/employees";
        String user = "root";
        String password = "080109";

        String sql =
                "SELECT id, name, salary "
                        + "FROM employees "
                        + "WHERE salary >= ?";

        try (
                Connection connection =
                        DriverManager.getConnection(url, user, password);

                PreparedStatement ps =
                        connection.prepareStatement(sql)
        ) {

            ps.setInt(1, 350000);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id")
                                + " "
                                + rs.getString("name")
                                + " "
                                + rs.getInt("salary")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}