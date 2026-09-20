public class Book {
    private String title;
    private double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    void introduce() {
        System.out.println("书名: " + title);
        System.out.println("价格: " + price);
    }
}
