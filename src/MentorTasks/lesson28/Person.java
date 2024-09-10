package MentorTasks.lesson28;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String city;
    private  List<Person> people;
    public String getName() {
        return name;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
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

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'';
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public Person() {
        this.people = new ArrayList<>();
    }

    public  void creatingList(){

        people.add(new Person("Frank", 45, "Philadelphia"));
        people.add(new Person("Grace", 22, "New York"));
        people.add(new Person("Hank", 50, "San Diego"));
        people.add(new Person("Ivy", 27, "Dallas"));
        people.add(new Person("Jack", 38, "New York"));
        people.add(new Person("Alice", 31, "New York"));
        people.add(new Person("Bob", 25, "Los Angeles"));
        people.add(new Person("Charlie", 40, "Chicago"));
        people.add(new Person("Diana", 35, "Houston"));
        people.add(new Person("Eve", 28, "New York"));

    }

    public static void main(String[] args) {

        Person person = new Person();
        person.creatingList();

        List<Person> personList = person.getPeople();

        System.out.println("Filtered list: ");
        personList.stream().filter(x-> x.getAge() < 30).forEach(x-> System.out.println(x));

        System.out.println("------------------------------------------------");
        System.out.println("Sorted list: ");
        personList.stream().filter(x-> x.getAge() > 30).sorted().map(Person::getName).forEach(x-> System.out.println(x));

        System.out.println("------------------------------------------------");
        System.out.println("Number of people live in New York: ");
        System.out.println(personList.stream().filter(x -> x.getCity().equals("New York")).count());

        System.out.println("------------------------------------------------");
        System.out.println("People over 25: ");
        Set<String> namesOver25 = personList.stream()
                .filter(p -> p.getAge() > 25)
                .map(Person::getName)
                .collect(Collectors.toSet());

        namesOver25.forEach(x-> System.out.println(x));
    }

    @Override
    public int compareTo(Person o) {
        return this.getName().compareTo(o.getName());
    }
}
