public class JobApplicationService {

    public static void checkExperience(int years)
            throws InvalidExperienceException {

        if (years < 0) {
            throw new InvalidExperienceException(
                    "経験年数は0以上で入力してください。"
            );
        }

        System.out.println("経験年数: " + years);
    }
}