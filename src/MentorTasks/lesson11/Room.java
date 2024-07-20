package MentorTasks.lesson11;

public class Room {
    private int roomNumber;
   private String type;
    private boolean isBooked;

    public Room(int roomNumber, String type, boolean isBooked) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.isBooked = isBooked;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBooked(Boolean isBooked) {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    @Override
    public String toString() {
        if(isBooked)
            return "Room " + roomNumber +
                    " " + type + '-'
                    + "Booked";
        else
            return  "Room " + roomNumber +
                    " " + type + '-'
                    + "NotBooked";
    }
}
