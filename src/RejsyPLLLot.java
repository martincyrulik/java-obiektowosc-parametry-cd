public class RejsyPLLLot {
    Lot[] tablicaRejsy;
    int iterator = 0;

    RejsyPLLLot(int size){
        tablicaRejsy = new Lot[size];
    }

    void addRejs(Lot lot){
            tablicaRejsy[iterator] = lot;
            iterator++;
    }

    void displayAllFlights(){
        for (int i = 0; i < tablicaRejsy.length && tablicaRejsy[i] != null; i++) {
            tablicaRejsy[i].displayLot();
        }
    }
}





