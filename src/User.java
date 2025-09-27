public class User {
    private String id;
    private String name;
    private String contactInfo;
    private String userType;
    private String verificationStatus;
    private double balance;
    private String transactionHistory;

    public User() {}
    public User(String id, String name, String contactInfo, String userType,
                String verificationStatus, double balance, String transactionHistory) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
        this.userType = userType;
        this.verificationStatus = verificationStatus;
        this.balance = balance;
        this.transactionHistory = transactionHistory;
    }

    public void initiateTransaction() {}
    public void manageAccount() {}
    public void updatePersonalData() {}
    public void ensureSecurity() {}

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getContactInfo() { return contactInfo; }
    public void setContactInfo(String contactInfo) { this.contactInfo = contactInfo; }

    public String getUserType() { return userType; }
    public void setUserType(String userType) { this.userType = userType; }

    public String getVerificationStatus() { return verificationStatus; }
    public void setVerificationStatus(String verificationStatus) { this.verificationStatus = verificationStatus; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public String getTransactionHistory() { return transactionHistory; }
    public void setTransactionHistory(String transactionHistory) { this.transactionHistory = transactionHistory; }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                ", userType='" + userType + '\'' +
                ", verificationStatus='" + verificationStatus + '\'' +
                ", balance=" + balance +
                ", transactionHistory='" + transactionHistory + '\'' +
                '}';
    }
}