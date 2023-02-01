package BankServices;

public class CustomerManager {
    private  CompanyCustomer companycustomer;
    private Customer _customer;
    private ICreditManager creditManager;


    public CustomerManager(Customer customer,ICreditManager creditManager) {

        this._customer=customer;
        this.creditManager=creditManager;

    }




    public CustomerManager(CompanyCustomer companycustomer) {
        this.companycustomer = companycustomer;
    }

    private CompanyCustomer _companycustomer;


    public void Save(){
        System.out.println("Müşteri kaydedildi." );
    }
    public void Delete(){
        System.out.println("Müşteri silindi : ");
    }
    public void GiveCredit(){
        creditManager.Calculate();
        System.out.println("Kredi verildi.");

    }



}
