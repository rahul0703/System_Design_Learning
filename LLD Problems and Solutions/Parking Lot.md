# Design: Parking Lot
## Requirements
1. Parking Lot should have multiple floors.
2. Parking Lot should have multiple gate (entry and exit)
3. Entry and Exit gates should be different
4. Parking gate should be manned (guard on gate)
5. Entry-gate should give/provide parking ticket
6. Exit-gate should have payment system
7. Parking should be available for different types of vehicle such as Bike, Car, Truck
8. Every floor/lot should have display board, displaying vacant parking spots

## Design
### Points to remember while coding
1. Same functionality of multiple class should be implemented on a parent class.
2. Always start by defining Base-Class


## Code

**Creating Base-Class**
```java
class ParkingLot {
    
	//Essential Data
	List<ParkingFloor> parkingFloors;
	List<Entrance> entrances;
	List<Exit> exits;
    
        //Meta Data
	Address address;
	String parkingLotName;

        //APIs
	public boolean isParkingSpaceAvailableForVehicle(Vehicle vehicle);
	public boolean updateParkingAttndant(ParkingAttendant parkingAttendant, int gateId)

}
```
```java
class ParkingFloor {
	//floor id
	int levelId;
        //List of parking space
	List<ParkingSpace> parkingSpaces;
        //Display Board
	ParkingDisplayBoard parkingDisplayBoard;
}
```
```java
class Gate {

	int gateId;
	ParkingAttendant parkingAttendant;

}

class Entrance extends Gate {

	public ParkingTicket getParkingTicket(Vehicle vehicle);

}

class Exit extends Gate {

	public ParkingTicket payForParking(ParkingTicket parkingTicket, PaymentType paymentType);

}
```

```java
class Address {

	String country;
	String state;
	String city;
	String street;
	String pinCode; //ZipCode
}
```
```java
class ParkingSpace {
	
	int spaceId;
	boolean isFree;
	double costPerHour;
	Vehicle vehicle;
	ParkingSpaceType parkingSpaceType;
}
```

```java
class ParkingDisplayBoard {

	Map<ParkingSpaceType, Integer> freeSpotsAvailableMap;

	public void updateFreeSpotsAvailable(ParkingSpaceType parkingSpaceType, int spaces);

}
```

```java
class Account {

	String name;
	String email;
	String password;
	String empId;
	Address address;

}

class Admin extends Account {

	public boolean addParkingFloor(ParkingLot parkingLot, ParkingFloor floor);
	public boolean addParkingSpace(ParkingFloor floor, ParkingSpace parkingSpace);
	public boolean addParkingDisplayBoard(ParkingFloor floor, ParkingDisplayBoard parkingDisplayBoard);
}

class ParkingAttendant extends Account {

	Payment paymentService;

	public boolean processVehicleEntry(Vehicle vehicle);
	public PaymentInfo processPayment(ParkingTicket parkingTicket, PaymentType paymentType);

}

```

```java
class Vehicle {
	
	String licenseNumber;
	VehicleType vehicleType;
	ParkingTicket parkingTicket;
	PaymentInfo paymentInfo;

}
```

```java
class ParkingTicket {
	
	int ticketId;
	int levelId;
	int spaceId;
	Date vehicleEntryDateTime;
	Date vehicleExitDateTime;
	ParkingSpaceType parkingSpaceType;
	double totalCost;
	ParkingTicketStatus parkingTicketStatus;

	public void updateTotalCost();
	public void updateVehicleExitTime(Date vehicleExitDateTime);

} 
```
```java
    class Payment {
    
        public PaymentInfo makePayment(ParkingTicket parkingTicket, PaymentType paymentType);
    }
    
    public enum PaymentType {
    
        CASH, CEDIT_CARD, DEBIT_CARD, UPI;
    }
    
    class PaymentInfo {
    
        double amount;
        Date paymentDate;
        int transactionId;
        ParkingTicket parkingTicket;
        PaymentStatus paymentStatus;
    
    }
```
```java
public enum ParkingSpaceType {
	
	BIKE_PARKING, CAR_PARKING, TRUCK_PARKING

}
```

