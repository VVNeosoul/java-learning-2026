public class JobApplicationApp {

    public static void main(String[] args) {

        try {
            JobApplicationService.checkExperience(-1);
        } catch (InvalidExperienceException e) {
            System.out.println(e.getMessage());
        }
    }
}