public class MethodPractice {

    public static void main(String[] args) {
        sayHello();
        greet("Tong");

        int result = add(10, 20);
        System.out.println(result);
    }

    public static void sayHello() {
        System.out.println("Hello Java!");
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name);
    }

    public static int add(int a, int b) {
        return a + b;
    }

}