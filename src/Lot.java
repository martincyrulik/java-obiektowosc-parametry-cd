public class Lot {
    int departure;
    int arrival;
    Samolot samolot;

    Lot(int departure, int arrival, Samolot samolot){
        this.departure = departure;
        this.arrival = arrival;
        this.samolot = samolot;
    }

    void displayLot(){
        System.out.print("Nr samolotu: ");
        for (char c : samolot.idSamolot){
            System.out.print(c);
        }
        System.out.println();
        System.out.println("Departure time: " + departure);
        System.out.println("Ariival time: " + arrival);
        System.out.println("----------------");
    }
}