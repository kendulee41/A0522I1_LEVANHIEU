package caseStudy.model;

public class Contract {
    private int someContracts;
    private int iDContract;
    private byte deposit;
    private byte totalMoney;
    private int codeCustomer;

    public Contract(int someContracts, int iDContract, byte deposit, byte totalMoney, int codeCustomer) {
        this.someContracts = someContracts;
        this.iDContract = iDContract;
        this.deposit = deposit;
        this.totalMoney = totalMoney;
        this.codeCustomer = codeCustomer;
    }

    public int getSomeContracts() {
        return someContracts;
    }

    public void setSomeContracts(int someContracts) {
        this.someContracts = someContracts;
    }

    public int getiDContract() {
        return iDContract;
    }

    public void setiDContract(int iDContract) {
        this.iDContract = iDContract;
    }

    public byte getDeposit() {
        return deposit;
    }

    public void setDeposit(byte deposit) {
        this.deposit = deposit;
    }

    public byte getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(byte totalMoney) {
        this.totalMoney = totalMoney;
    }

    public int getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(int codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "someContracts=" + someContracts +
                ", iDContract=" + iDContract +
                ", deposit=" + deposit +
                ", totalMoney=" + totalMoney +
                ", codeCustomer=" + codeCustomer +
                '}';
    }
}
