import java.util.ArrayList;
import java.util.List;

public class GenericsPractice {

    public static void main(String[] args) {

        List<String> skills = new ArrayList<>();

        skills.add("Java");
        skills.add("SQL");
        skills.add("Git");

        List<Integer> scores = new ArrayList<>();

        scores.add(80);
        scores.add(90);
        scores.add(75);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        numbers.forEach(number -> {
            System.out.println(number * 2);
        });

        skills.forEach(skill -> System.out.println(skill));

        for (int score : scores) {
            System.out.println(score);
        }
    }
}