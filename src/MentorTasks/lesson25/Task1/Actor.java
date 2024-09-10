package MentorTasks.lesson25.Task1;

public class Actor {

    private String name;
    private int age;
    private int actingSkill;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getActingSkill() {
        return actingSkill;
    }

    public void setActingSkill(int actingSkill) {
        this.actingSkill = actingSkill;
    }

    public Actor(String name, int age, int actingSkill) {
        this.name = name;
        this.age = age;
        this.actingSkill = actingSkill;
    }


}
