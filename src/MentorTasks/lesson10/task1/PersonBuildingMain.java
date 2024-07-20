package MentorTasks.lesson10.task1;


public class PersonBuildingMain {
    public static void main(String[] args) {

        Building eiffelTower = new Building(1, "Eiffel Tower", 1, 3, "A-101", false);


        Person person = new Person(1, "Gustave", "Eiffel", 91, "Engineer", 1, eiffelTower);


        System.out.println("Person Details:");
        System.out.println(person);

        System.out.println("\nBuilding Details:");
        System.out.println(eiffelTower);


        System.out.println("Person Name: " + person.getName());
        System.out.println("Building Name: " + eiffelTower.getBuildingName());
    }
}
