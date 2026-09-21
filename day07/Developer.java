public class Developer extends Employee {

    public Developer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(getName() + " はJavaを書いています。");
    }
}