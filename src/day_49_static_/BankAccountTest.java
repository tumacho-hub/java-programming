package day_49_static_;

import OfficesHoursMainFolder.Practice_05_12_2021.BankAccount;

 class MyBankAccountTest {
    public static void main(String[] args) {
        MyBankAccount husband = new MyBankAccount();
        husband.user = "husband";
        husband.ShowBalance();
        husband.Spend(100.0);
        husband.ShowBalance();

        MyBankAccount wife = new MyBankAccount();
        wife.user = "wife";
        wife.ShowBalance();
        wife.Spend(400);
        wife.ShowBalance();

        husband.ShowBalance();
        System.out.println(MyBankAccount.balance);

    }
}
