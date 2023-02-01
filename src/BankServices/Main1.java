package BankServices;

public class Main1 {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
        customerManager.GiveCredit();



    }
}
