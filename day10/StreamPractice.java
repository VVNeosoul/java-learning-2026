import java.util.List;

public class StreamPractice {

    public static void main(String[] args) {

        List<Integer> scores =
                List.of(55, 70, 85, 90, 40);

        List<Integer> passedScores =
                scores.stream()
                        .filter(score -> score >= 60)
                        .toList();

        System.out.println(passedScores);;

        List<String> skills =
                List.of("java", "sql", "git");

        skills.stream()
                .map(skill -> skill.toUpperCase())
                .forEach(System.out::println);


    }
}