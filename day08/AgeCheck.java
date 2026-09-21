public class AgeCheck {

    public static void main(String[] args) {
        checkAge(15);
    }

    public static void checkAge(int age) {

        if (age < 20) {
            throw new IllegalArgumentException("20歳未満です。");
        }

        System.out.println("応募できます。");
    }
}