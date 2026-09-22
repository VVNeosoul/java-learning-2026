import java.util.HashSet;

public class HashSetPractice {

    public static void main(String[] args) {

        HashSet<String> skills = new HashSet<>();

        skills.add("Java");
        skills.add("SQL");
        skills.add("Java");
        skills.add("Git");

        boolean b1 = skills.contains("Java");
        skills.remove("SQL");
        int a = skills.size();

        System.out.println(skills);
        System.out.println(b1);
        System.out.println(a);

    }
}