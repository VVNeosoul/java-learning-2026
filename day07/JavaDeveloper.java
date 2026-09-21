public class JavaDeveloper implements Programmer {

    @Override
    public void code() {
        System.out.println("Javaでコードを書きます。");
    }

    @Override
    public void debug() {
        System.out.println("Javaプログラムをデバッグします。");
    }
}