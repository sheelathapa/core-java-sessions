package bank;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private String bankName;
    private String customerId;
    private int routingNumber;
    private String accountOpeningDate;
    private String accountType;
    private boolean hasDebitCard;
    private boolean hasCreditCard;
    private double accountBalance;
    private boolean isLocked;
    private String ssn;

    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName=accountHolderName;
    }

    public String getBankName(){
        return bankName;
    }
    public void setBankName(String bankName){
        this.bankName=bankName;
    }
    public String getCustomerId(){
        return customerId;
    }
    public void setCustomerId(String customerId){
        this.customerId=customerId;
    }
    public int getRoutingNumber(){
        return routingNumber;
    }
    public void setRoutingNumber(int routingNumber){
        this.routingNumber=routingNumber;
    }
     public String getAccountOpeningDate(){
        return accountOpeningDate;
     }
     public void setAccountOpeningDate(String accountOpeningDate){
        this.accountOpeningDate=accountOpeningDate;
     }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public boolean isHasDebitCard() {
        return hasDebitCard;
    }

    public void setHasDebitCard(boolean hasDebitCard) {
        this.hasDebitCard = hasDebitCard;
    }

    public boolean isHasCreditCard() {
        return hasCreditCard;
    }

    public void setHasCreditCard(boolean hasCreditCard) {
        this.hasCreditCard = hasCreditCard;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}
