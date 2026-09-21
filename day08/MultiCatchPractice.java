public class MultiCatchPractice {

    public static void main(String[] args) {

        String[] skills = {"Java", "SQL"};

        try {
            System.out.println(skills[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("配列の範囲外です。");
        } catch (Exception e) {
            System.out.println("エラーが発生しました。");
        }
    }
}