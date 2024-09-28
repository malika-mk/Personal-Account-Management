import java.util.Scanner;

public  class Main {
    public static void  main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();

        PersonalAccount Malika = new PersonalAccount( 12345, "Malika", 1000000.11);
        Malika.withdraw(11000);
        System.out.println(Malika.getBalance());
        Malika.getAccountNumber();
        System.out.println(Malika.getAccountNumber());
        Malika.withdraw(500);
        System.out.println(Malika.getBalance());
        Malika.getAccountHolder();
        System.out.println(Malika.getAccountHolder());
        Malika.getTransactions();
        System.out.println(Malika.getTransactions());
        Malika.printTransactionHistory();





    }
}