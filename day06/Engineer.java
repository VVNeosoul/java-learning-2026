public class Engineer extends Person {

    private String skill;

    public Engineer(String name, int age, String skill) {
        super(name, age);
        this.skill = skill;
    }

    public void showSkill() {
        System.out.println("スキル: " + skill);
    }
    @Override
    public void introduce() {
        System.out.println("私はJavaエンジニアです。");
    }
}