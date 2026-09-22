import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<String> skills = new ArrayList<>();

        skills.add("Java");
        skills.add("SQL");
        skills.add("Git");

        skills.add("Spring Boot");

        System.out.println(skills.get(0));

        skills.set(1, "MySQL");

        skills.remove("Git");
        for (String skill : skills) {
            System.out.println(skill);
        }

        System.out.println(skills.size());

        System.out.println(skills);
    }
}