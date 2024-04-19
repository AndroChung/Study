package myPackage;

public class RoomOccupancy {
	private int roomNumber, peopleInRoom;
	public static int totalNumber = 0;
	
	// Constructor it has roomNumber
	RoomOccupancy(int roomNum, int people) {
		this.roomNumber = roomNum;
		this.peopleInRoom = people;
		totalNumber += people;
		System.out.println("The room number " + roomNumber + " is checked in" + 
							"\nPeople in room: " + peopleInRoom);
	}
	
	
	// plus 1 person in room
	public void addOneToRoom() {
		peopleInRoom++;
		totalNumber++;
		System.out.println("One person came in " + roomNumber + ", People in " + roomNumber + ": " + peopleInRoom);
	}
	
	// remove 1 person in room
	public void removeOneFromRoom() {
		if (peopleInRoom > 0) {
			peopleInRoom--;
			totalNumber--;
			System.out.println("One person went out from " + roomNumber + ", People in " + roomNumber + ": " + peopleInRoom);
		} else {
			System.out.println("No person in " + roomNumber);
		}
	}
	
	// get instance value
	public int getNumber(RoomOccupancy room) {
		return room.roomNumber;
	}
	public int getPeopleInRoom(RoomOccupancy room) {
		return room.peopleInRoom;
	}
	
	// get class value
	public int getTotal() {
		return totalNumber;
	}
}
