public class BookApp {

    public static void main(String[] args) {

        Book book1 = new Book("你好世界", 34.2);
        Book book2 = new Book("Yuki", 32.3);

        book1.introduce();
        book2.introduce();
    }
}
