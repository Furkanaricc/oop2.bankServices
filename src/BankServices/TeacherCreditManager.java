package BankServices;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager {
    @Override
    public void Calculate() { //Hesaplandı varsayıyoruz.
        System.out.println("Öğretmen kredisi hesaplandı..");
    }


}
