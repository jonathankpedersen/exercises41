package Task2;

public class Building {
    Room room[];
    int numberOfBathrooms;
    int numberOfFloors;
    boolean isOfficeBuilding;
    public Building(Room room[],int numberOfBathrooms,int numberOfFloors,boolean isOfficeBuilding){
        this.room =room;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public Room[] getRoom() {
        return room;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }
}
