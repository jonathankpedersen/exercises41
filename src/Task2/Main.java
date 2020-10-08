package Task2;

public class Main {
    public static void main(String[] args){
        Room room1 = new Room(3,5,3);
        Room room2 = new Room(2,1,9);
        Room room3 = new Room(1,8,2);
        Room rooms[] ={room1,room2,room3};
        Building building = new Building(rooms,1,2,false);
        if (building.getNumberOfFloors()>building.room.length) {
            System.out.println("This is an odd building.");
        }

        }

    }

