import java.util.Arrays;

public class RejsyPLLLot {
    Lot[] rejsy;
    int iterator = 0;

    RejsyPLLLot(int size){  //tworzę tablicę rejsów o zadanym wymiarze: n.
        rejsy = new Lot[size];
    }


    /*******************************************************************************
     *              -------> Procedura addRejs <-----------
     *
     * Procedura addRejs uruchamia procedurę checkRejs(Lot lot), gdy otrzyma
     * wartość false - to wyświetla na ekranie, że tego lotu nie można dodać
     * do tablicy rejsów rejsy[], a gdy otrzyma wartość 'true', to
     * wyświetla ten lot na ekranie - w domyśle jest możliwy do wykonania.
     *
     *******************************************************************************/

    void addRejs(Lot lot) {
        boolean b = checkRejs(lot);
        if (b == false){
            System.out.println("Nie można dodać kolejnego rejsu dla tego samolotu:");
            rejsy[iterator-1].displayLot();
        } else {
            rejsy[iterator-1].displayLot();
        }
    }

    /*******************************************************************************
     *              -------> Procedura checkRejs <-----------
     *
     * Procedura ta jako swój argument przyjmuje kolejny lot z klasy Lot.
     * Idea jest taka, że zanim dodam kolejny lot to tablicy rejsy[], to chcę
     * najpierw sprawdzić, czy samolot ten ma już swój przydzielony lot.
     * Jeśli tak się dzieje, to samolot ten już nie może wykonać kolejnego rejsu
     * Dlatego też nie dopisuję go do tablicy rejsów: rejsy[] - co jest widoczne
     * w procedurze brakiem instrukcji rejsy[iterator] = lot.
     * Do porównywania użyłem pól: rejsy[i].samolot.idSamolot i lot.samolot.idSamolot.
     * Jak widać sprawdzam po kolei wszystkie obiekty z tablicy rejsy[]
     * z bieżącym obiektem lot z tablicy Lot. Użyłem do tego pętli do ... while.
     * Pętla kręci się dpóki nie znajdziemy elementów identycznych, wtedy następuję
     * wskazanie obiektu founded->lot, zerwanie pętli, brak przypisania tego lotu
     * do tablicy rejsy[], a następnie zwrócenie false jako wyniku działania procedury
     *
     * Jeśli natomiast pętla do ... while, nie znajdzie elementów identycznych,
     * co oznacza, że ten samolot nie ma obecnie żadnego lotu, wtedy następuje
     * dopisanie tegoż lotu do tablicy rejsy[] i zwiększenie iteratora o 1,
     * a następnie zwrócenie wartości true jako wynik działania procedury.
     *
     *******************************************************************************/

    boolean checkRejs(Lot lot) {
        int i = 0;
        Lot founded = null;
        if (iterator == 0) {
            rejsy[iterator] = lot;
            iterator++;
        } else {
            do {
                if (Arrays.equals(rejsy[i].samolot.idSamolot, lot.samolot.idSamolot)) {
                    founded = lot;
                }
                i++;
            } while (i < rejsy.length && i < iterator && founded == null);
            if (founded != null) {
                return false;
            } else {
                rejsy[iterator] = lot;
                iterator++;
            }
        }
        return true;
    }

    /*******************************************************************************
     *              -------> Procedura void displayAllFlights() <-----------
     *
     * Procedura displayAllFlights() wyświtla na ekranie wszystkie możliwe
     * rejsy do wykonania, oczywiście z pominięciem tych których nie można
     * dodać ponownie do tablicy rejsów: rejsy[]
     *
     *******************************************************************************/

    void displayAllFlights(){
        for (int i = 0; i < rejsy.length && rejsy[i] != null; i++) {
            rejsy[i].displayLot();
        }
    }
}





