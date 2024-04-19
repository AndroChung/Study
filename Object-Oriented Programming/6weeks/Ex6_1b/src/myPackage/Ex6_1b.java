package myPackage;

public class Ex6_1b {

	public static void main(String[] args) {
		RoomOccupancy room1 = new RoomOccupancy(101, 3);
		RoomOccupancy room2 = new RoomOccupancy(102, 2);
		RoomOccupancy room3 = new RoomOccupancy(103, 1);
		RoomOccupancy room4 = new RoomOccupancy(104, 5);
		
		// test add or remove method
		room1.addOneToRoom();
		room2.removeOneFromRoom();
		room4.removeOneFromRoom();
		room3.addOneToRoom();
		
		// if no people in room 
		room2.removeOneFromRoom();
		room2.removeOneFromRoom();
		
		// Total Number now(101: 4, 102 :0, 103: 2, 104: 4)
		System.out.println("Total number in all room is " + RoomOccupancy.totalNumber);
	}

}
