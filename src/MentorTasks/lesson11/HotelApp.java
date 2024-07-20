package MentorTasks.lesson11;

import java.util.Scanner;

public class HotelApp {
    public static void main(String[] args) {

        Hotel hotel = new Hotel();
        Scanner sc = new Scanner(System.in);
        int choose = 0;

        while (choose != 6) {
            System.out.println("1) Add room  2) Book room  3) Cancel your booked room  4) Get room you want  5) Hotel's room list  6) Exit");
            System.out.println("Choose an option");
            choose = sc.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("Add room");
                    System.out.println("Enter room number: ");
                    int roomNumber = sc.nextInt();
                    System.out.println("Enter room type(single/double/deluxe  ): ");
                    sc.nextLine(); // consume the newline
                    String type = sc.nextLine();
                    Room room = new Room(roomNumber, type, false);
                    hotel.addRoom(room);
                    break;
                case 2:
                    System.out.println("Book room");
                    System.out.println("Enter room number: ");
                    int bookRoomNumber = sc.nextInt();
                    hotel.bookRoom(bookRoomNumber);
                    break;
                case 3:
                    System.out.println("Cancel your booked room");
                    System.out.println("Enter room number: ");
                    int cancelRoomNumber = sc.nextInt();
                    hotel.cancelBookRoom(cancelRoomNumber);
                    break;
                case 4:
                    System.out.println("Get room you want");
                    System.out.println("Enter room number: ");
                    int getRoomNumber = sc.nextInt();
                    hotel.getRoom(getRoomNumber);
                    break;
                case 5:
                    System.out.println("Hotel's room list");
                    hotel.listRooms();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
        }
    }
}
