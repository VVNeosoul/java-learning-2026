public class FinallyPractice {
    public static void main(String[] args) {


        try {
            System.out.println("処理開始");
            int result = 10 / 2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("エラー");
        } finally {
            System.out.println("必ず実行されます。");
        }

    }
}
