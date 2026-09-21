public class ExceptionPractice {

    public static void main(String[] args) {

        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("0では割れません。");
        }

        System.out.println("プログラム終了");
    }
}