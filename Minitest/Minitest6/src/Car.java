public class Car extends Vehicle {
    private final int numOfSeats;

    public Car(String id, String brand, int year, int numOfSeats) {
        super(id, brand, year);
        this.numOfSeats = numOfSeats;
    }
    public int getNumOfSeats() {
        return numOfSeats;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car - ID: " + super.getId()
                + ", Brand: " + super.getBrand()
                + ", Year: " + super.getYear()
                + ", Seats: " + getNumOfSeats());
    }
    @Override
    public double calculateTax() {
        return numOfSeats * 300;
    }
}
