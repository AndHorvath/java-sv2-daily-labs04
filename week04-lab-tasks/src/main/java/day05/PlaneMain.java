package day05;

public class PlaneMain {
    public static void main(String[] args) {
        Plane plane = new Plane(100);

        plane.addPassenger(new Passenger("John Doe", "XYZ", 5));
        plane.addPassenger(new Passenger("Jack Doe", "ZYX", 6));

        System.out.println(plane.numberOfPackages());
    }
}