import java.util.Arrays;

public class MainPLLLot {
    public static void main(String[] args) {

        int n = 100;    //ustawiamy na sztywno ilość rejsów;
        RejsyPLLLot rejsy = new RejsyPLLLot(n);

        char[] idSamolot1 = {'S','P','L','R'};
        Samolot samolot1 = new Samolot(idSamolot1);
        Lot lot1 = new Lot(6, 8, samolot1);

        //dodaj 1 lot do tablicy rejsów
        rejsy.addRejs(lot1);

        //dodaj 2 lot do tablicy rejsów
        char[] idSamolot2 = {'S','P','L','R'};
        Samolot samolot2 = new Samolot(idSamolot2);
        Lot lot2 = new Lot(15, 21, samolot2);
        rejsy.addRejs(lot2);

        char[] idSamolot3 = {'S','P','L','M','F'};
        Samolot samolot3 = new Samolot(idSamolot3);
        Lot lot3 = new Lot(12, 14, samolot3);
        rejsy.addRejs(lot3);

        char[] idSamolot4 = {'S','P','L','M','H'};
        Samolot samolot4 = new Samolot(idSamolot4);
        Lot lot4 = new Lot(10, 11, samolot4);
        rejsy.addRejs(lot4);

        char[] idSamolot5 = {'S','P','L','V'};
        Samolot samolot5 = new Samolot(idSamolot5);
        Lot lot5 = new Lot(23, 8, samolot5);
        //rejsy.addRejs(lot5);

        char[] idSamolot6 = {'S','P','L','N','A'};
        Samolot samolot6 = new Samolot(idSamolot6);
        Lot lot6 = new Lot(11, 15, samolot6);
        //rejsy.addRejs(lot6);

        char[] idSamolot7 = {'S','P','L','N','A'};
        Samolot samolot7 = new Samolot(idSamolot7);
        Lot lot7 = new Lot(14, 16, samolot7);
        //rejsy.addRejs(lot7);



        //wyświetl wszystkie rejsy
        System.out.println("********Wszystkie obecne rejsy********");
        rejsy.displayAllFlights();

        /*char[] s1 = {'S','P','L','R'};
        char[] s2 = {'S','P','L','R'};
        if (s1 == s2){
            System.out.println("Są równe");
        } else {
            System.out.println("Nie są równe");
        }
        if (Arrays.equals(s1,s2)) {
            System.out.println("Są równe.");
        } else {
            System.out.println("Nie są równe.");
        } */
    }
}
