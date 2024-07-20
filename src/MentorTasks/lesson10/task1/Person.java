package MentorTasks.lesson10.task1;

public class Person {
    int id;
    String name;
    String lastName;
    int age;
    String profession;
    int numberOfFamilies;
    Building building;

    public Person(int id, String name, String lastName, int age, String profession, int numberOfFamilies, Building building) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.profession = profession;
        this.numberOfFamilies = numberOfFamilies;
        this.building = building;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getNumberOfFamilies() {
        return numberOfFamilies;
    }

    public void setNumberOfFamilies(int numberOfFamilies) {
        this.numberOfFamilies = numberOfFamilies;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                ", numberOfFamilies=" + numberOfFamilies +
                ", building=" + building +
                '}';
    }
}
