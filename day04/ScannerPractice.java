import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("名前を入力してください: ");
        String name = scanner.nextLine();
        System.out.print("年齢を入力してください: ");
        int age = scanner.nextInt();


        System.out.println("こんにちは、" + name + "さん");


        System.out.println("年齢は " + age + " 歳です。");
    }
}