class BankAccount{
    private double balance;
    public void setBalance(double balance)//setter
    {
        if(balance>0)
        {
            this.balance=balance;
        }
        else
        {
            System.out.print("Input not valid");
        }
    }
    public double getBalance()//getter
    {
        return balance;
    }
}
public class encapulation
{
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setBalance(0);
        System.out.println(b.getBalance());
    }
}