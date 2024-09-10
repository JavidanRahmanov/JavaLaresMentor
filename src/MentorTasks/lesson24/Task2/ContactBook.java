package MentorTasks.lesson24.Task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactBook {
    private Map<String, String> contacts;

    public ContactBook() {
        contacts = new HashMap<>();
    }


    public void addContact(String name, String phoneNumber) {
        if (contacts.containsKey(name)) {
            System.out.println("Bu ad artıq mövcuddur. Yeniləyirəm...");
        }
        contacts.put(name, phoneNumber);
        System.out.println(name + " adı ilə " + phoneNumber + " nömrəsi əlavə edildi.");
    }


    public void removeContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            System.out.println(name + " kontaktı silindi.");
        } else {
            System.out.println(name + " adlı kontakt tapılmadı.");
        }
    }


    public void searchContact(String name) {
        if (contacts.containsKey(name)) {
            System.out.println(name + ": " + contacts.get(name));
        } else {
            System.out.println(name + " adlı kontakt tapılmadı.");
        }
    }


    public void displayAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Kontakt kitabı boşdur.");
        } else {
            System.out.println("Bütün kontaktlar:");
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();
        Scanner scanner = new Scanner(System.in);
        String name, phoneNumber;
        int choice;

        do {
            System.out.println("\n1. Yeni Kontakt Əlavə Et");
            System.out.println("2. Kontaktı Sil");
            System.out.println("3. Ad ilə Axtarış");
            System.out.println("4. Bütün Kontaktları Göstər");
            System.out.println("5. Çıxış");
            System.out.print("Seçim edin: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Ad daxil edin: ");
                    name = scanner.nextLine();
                    System.out.print("Telefon nömrəsi daxil edin: ");
                    phoneNumber = scanner.nextLine();
                    contactBook.addContact(name, phoneNumber);
                    break;
                case 2:
                    System.out.print("Silinəcək ad daxil edin: ");
                    name = scanner.nextLine();
                    contactBook.removeContact(name);
                    break;
                case 3:
                    System.out.print("Axtarılan ad daxil edin: ");
                    name = scanner.nextLine();
                    contactBook.searchContact(name);
                    break;
                case 4:
                    contactBook.displayAllContacts();
                    break;
                case 5:
                    System.out.println("Çıxış edilir...");
                    break;
                default:
                    System.out.println("Yanlış seçim. Yenidən cəhd edin.");
            }
        } while (choice != 5);

    }
}

