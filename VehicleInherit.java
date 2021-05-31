/*
* This is a program that
* generates two vehicles.
*
* @author  Sean McLeod
* @version 1.0
* @since   2021-05-27
*/

import java.util.Scanner;

public final class VehicleInherit {
    private VehicleInherit() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This function
    * is the main function.
    * @param args
    */
    public static void main(final String[] args) {
        // call object
        Truck truck = new Truck();
        Bike bike = new Bike();

        // current state
        System.out.println("Truck before: ");
        truck.printVehicleInfo();
        System.out.println("Amount of air: " + truck.provideAir(0));
        System.out.println("Plate number: " + truck.getPlateNumber());

        // input
        System.out.println();
        Scanner truckInput = new Scanner(System.in);
        System.out.print("What is the color of the truck: ");

        try {
            String truckColour = truckInput.nextLine();
            System.out.print("Accelerate by: ");
            int truckAccelerate = truckInput.nextInt();
            System.out.print("Brake by: ");
            int truckBrake = truckInput.nextInt();
            System.out.print("How much air is provided: ");
            int amountOfAir = truckInput.nextInt();
            System.out.print("What is the plate number: ");
            String plateNumber = truckInput.next();

            // pass the states in
            truck.setColour(truckColour);
            truck.acceleration(truckAccelerate);
            truck.brake(truckBrake);
            truck.setPlateNumber(plateNumber);

            // print the changed state
            System.out.println("\nTruck after:");
            truck.printVehicleInfo();
            System.out.println("Amount of air: "
                               + truck.provideAir(amountOfAir));
            System.out.println("Plate number: "
                               + truck.getPlateNumber() + "\n");

            System.out.println("--------------------------");

            // current state
            System.out.println("\nBike before: ");
            bike.printVehicleInfo();
            System.out.println("Cadence: " + bike.getCadence());

            // input
            System.out.println();
            Scanner bikeInput = new Scanner(System.in);
            System.out.print("What is the color of the bike: ");
            String bikeColour = bikeInput.nextLine();
            System.out.print("Accelerate by: ");
            int bikeAccelerate = bikeInput.nextInt();
            System.out.print("Brake by: ");
            int bikeBrake = bikeInput.nextInt();
            System.out.println("Ring the bell!");

            // pass the states in
            bike.setColour(bikeColour);
            bike.acceleration(bikeAccelerate);
            bike.brake(bikeBrake);

            // current state
            System.out.println("\nBike after: ");
            bike.printVehicleInfo();
            System.out.println("Cadence: " + bike.getCadence());
            System.out.println(bike.ringBell());

            // get the number of tires of the truck and the bike
            System.out.println("# of tires of a truck: " + truck.nOfTires());
            System.out.println("# of tires of a bike: " + bike.nOfTires());

        } catch (Exception e) {
            System.out.println("\nPlease enter an integer");
        }
    }
}
