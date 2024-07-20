package MentorTasks.lesson11;

import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
    ArrayList<Room> rooms = new ArrayList<>();
    ArrayList<Room> bookedRooms = new ArrayList<>();


    public Hotel() {
        rooms.add(new Room(123, "single", false));
        rooms.add(new Room(345, "double", false));
        rooms.add(new Room(756, "deluxe", false));
    }

    public void addRoom(Room room) {
        rooms.add(room);
        System.out.println("Room " + room.getRoomNumber() + " added.");
    }

    public void bookRoom(int bookRoomNumber) {
        boolean isFound = false;
        for (Room room : rooms) {
            if (room.getRoomNumber() == bookRoomNumber) {
                System.out.println("Room number " + bookRoomNumber + " is booked");
                room.setBooked(true);
                bookedRooms.add(room);
                rooms.remove(room);
                isFound = true;
                break;
            }
        }
        if (!isFound)
            System.out.println("Room isn't found");
    }

    public void cancelBookRoom(int cancelRoomNumber) {
        boolean isFound = false;
        for (Room room : bookedRooms) {
            if (room.getRoomNumber() == cancelRoomNumber) {
                System.out.println("Room number " + cancelRoomNumber + " booking is cancelled");
                room.setBooked(false);
                rooms.add(room);
                bookedRooms.remove(room);
                isFound = true;
                break;
            }
        }
        if (!isFound)
            System.out.println("This room was not booked");
    }

    public void getRoom(int roomNumber) {
        boolean isFound = false;
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                System.out.println(room + " is found");
                isFound = true;
                break;
            }
        }
        if (!isFound)
            System.out.println("This room is not found");
    }

    public void listRooms() {
        System.out.println("Available rooms:");
        for (Room room : rooms) {
            System.out.println(room);
        }
        System.out.println("Booked rooms:");
        for (Room room : bookedRooms) {
            System.out.println(room);
        }
    }
}
