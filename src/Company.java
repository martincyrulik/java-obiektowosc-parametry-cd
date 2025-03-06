public class Company {
    char[] name;
    long nip;
    Adres address;

    Company(char[] name, long nip, Adres address){
        this.name = name;
        this.nip = nip;
        this.address = address;
    }

    void display(){
        System.out.print("Name: ");
        for (char c : name){
            System.out.print(c);
        }
        System.out.println();
        System.out.println("NIP: " + nip);
        address.display();
    }

}
