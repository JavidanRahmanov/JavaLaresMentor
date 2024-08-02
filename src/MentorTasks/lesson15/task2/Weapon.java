package MentorTasks.lesson15.task2;

public class Weapon {

    public  void attack(){

        System.out.println("Performing a basic attack.");
    }

    public  void attack(int damage){

        System.out.println("Performing a regular attack with" + damage + " damage.");
    }

    public  void attack(double criticalMultiplier){

        System.out.println("Performing a critical attack with a damage multiplier of " + criticalMultiplier);
    }

    public  void attack(String specialMove){

        System.out.println( "Performing a special attack: " + specialMove);
    }


    public static void main(String[] args) {
        // Create instances of Weapon
        Weapon sword = new Weapon();
        Weapon bow = new Weapon();

        // Use sword to perform different types of attacks
        sword.attack();
        sword.attack(50);
        sword.attack(2.5);
        sword.attack("Slash");

        // Use bow to perform different types of attacks
        bow.attack();
        bow.attack(30);
        bow.attack(1.8);
        bow.attack("Piercing Shot");
    }
}

