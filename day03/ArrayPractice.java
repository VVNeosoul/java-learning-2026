public class ArrayPractice {
    public static void main(String[] args) {

        String[] skills = {
                "Java",
                "SQL",
                "Git",
                "Spring Boot"
        };

        for (int i = 0; i < skills.length; i++) {
            System.out.println(skills[i]);
        }

        System.out.println(skills[0]);
        System.out.println(skills[1]);
    }
}