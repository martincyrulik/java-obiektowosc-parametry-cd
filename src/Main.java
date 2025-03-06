public class Main {
    public static void main(String[] args) {

        int n = 2000;
        CompanyRepo companyRepo = new CompanyRepo(n);

        char[] street = {'p','o','l','n','a'};
        Adres address = new Adres(street, 3, 2);

        char[] name = {'l','u','f','t','h','a','n','s','a'};
        Company c1 = new Company(name, 1231231231, address);

        //dodanie 1 firmy
        companyRepo.add(c1);

        char[] name2 = {'b','i','e','d','r','o','n','k','a'};
        Company c2 = new Company(name2, 1113338882, address);

        //dodanie 2 firmy
        companyRepo.add(c2);

        //dodanie 3 firmy
        char[] name3 = {'a','b','c'};
        Adres address2 = new Adres(street, 5, 1);
        Company c3 = new Company(name3, 1119992223, address2);
        companyRepo.add(c3);

        //wyświetlenie wszystkich firm
        companyRepo.displayAll();

        System.out.println("------poszukiwanie firmy o NIP = 1113338882 -------");
        Company company = companyRepo.findCompany(1113338882);
        if (company != null) {
            company.display();
        } else {
            System.out.println("Not find.");
        }

        System.out.println("------poszukiwanie firmy o NIP = 1241224114 -------");
        company = companyRepo.findCompany(1241224114);
        if (company != null) {
            company.display();
        } else {
            System.out.println("Not find.");
        }
    }
}
