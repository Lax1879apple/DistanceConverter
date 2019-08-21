public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHours){

        if(kilometersPerHours < 0){
            return -1;
        }
        long milesPerHour = Math.round(kilometersPerHours / 1.609);
        return milesPerHour;
        // return Math.round(kilometersPerHours / 1.609); // this code works and does the same function as above.
    }

    public static void printConversion(double kilometerPerHour){

        if(kilometerPerHour < 0){
            System.out.println("Invalid value");
        }else {
            long milesPerHour = toMilesPerHour(kilometerPerHour);
            System.out.println(kilometerPerHour +
                    " Km/h = " + milesPerHour + " mi/h");
        }
    }
}
