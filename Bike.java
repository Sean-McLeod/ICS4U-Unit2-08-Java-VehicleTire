/*
* This is a class that has
* the Bike's properties and states.
*
* @author  Sean McLeod
* @version 1.0
* @since   2021-05-28
*/

public final class Bike extends Vehicle {
    /** Cadence of bike. */
    private double cadence;
    /** Number of tires for bike. */
    private int nOfTire;
    /** Cadence rate of bike. */
    private static final double CADENCERATE = 0.079;
    /** Number for gear ratio. */
    private static final double FIFTYTHREE = 53;
    /** Number for gear ratio. */
    private static final double TWELVE = 12;

    /** Constructor for bike. */
    public Bike() {
        super();
        this.cadence = 0;
        this.nOfTire = 2;
    }

    /**
    * This is the getter for cadence.
    * @return cadence
    */
    public double getCadence() {
        /* When the speed unit is km/h,
        for an average bicycle, the formula is
        cadence = speed/(.079 x gear ratio).
        Also, the average gear ratio is 53/12. */
        this.cadence = super.getSpeed() / (CADENCERATE * (FIFTYTHREE / TWELVE));
        return this.cadence;
    }

    /**
    * This method rings the bell.
    * @return Ring, Ring
    */
    public String ringBell() {
        return "Ring, Ring!";
    }

    /**
    * This method returns the number of tires.
    * @return nOfTire
    */
    public int nOfTires() {
        return nOfTire;
    }
}
