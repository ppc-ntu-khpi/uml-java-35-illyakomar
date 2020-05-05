package domain;

import java.util.List;

public class Bank {

    private String name;

    private String address;

    private int idBank;

    private List<Account> accounts;

    private List<BankEmployee> bankEmployee;

    public String getAddress() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public BankEmployee addBankEmployee(BankEmployee bankEmployee) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public BankEmployee removeBankEmployee(BankEmployee bankEmployee) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
