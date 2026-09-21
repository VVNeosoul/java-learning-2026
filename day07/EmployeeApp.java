public class EmployeeApp {

    public static void main(String[] args) {

        Employee employee1 = new Developer("Tong");
        Employee employee2 = new Designer("Yuki");

        employee1.work();
        employee2.work();
    }   
}