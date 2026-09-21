public class Designer extends Employee {

    public Designer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(getName() + " はUIをデザインしています。");
    }
}
