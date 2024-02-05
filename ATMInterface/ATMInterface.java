
import java.util.*;
class userbankacc{
    private double bal;

    public userbankacc(double bal) {
        this.bal = bal;
    }

    public double getBal() {
        return bal;
    }
 public void deposite(double amt){
        if(amt>0){
            bal+=amt;
            System.out.println("Deposited Succesfully !! Current Balanc is" + bal);
        }else {
            System.out.println("Insufficient Balance...");
        }
 }

    public void withdraw(double amt) {
        bal-=amt;
        System.out.println("Wuthdreaw Succesfully!!" +bal);
    }
}
class ATMFun{
    private userbankacc acc;
    Scanner sc =new Scanner(System.in);

    public ATMFun(userbankacc acc) {
        this.acc = acc;
    }
    public void function(){
        System.out.println("1 : Display Balance");
        System.out.println("2 : Deposite Amount");
        System.out.println("3 : Withdreaw Amount");
        System.out.println("4 : Exit");
    }
    public void run(){
        int choice;
        do{
            function();
            System.out.println("Enter Your Choice");
            choice=sc.nextInt();
            switch (choice){
                case 1:checkbal();
                break;
                case 2:deposite();
                break;
                case 3: withdraw();
                break;
                case 4: System.out.println("Thank You For Banking with Us" + acc.getBal());
                break;
                default:System.out.println("Enter Valid Choice");
            }
        }while (choice!=4);
    }
    private void checkbal(){
        System.out.println("Your Current Balance Is"+acc.getBal());
    }
    private void deposite(){
        System.out.println("Enter The Amount of Deposite");
        double amt = sc.nextDouble();
        acc.deposite(amt);
        }
        private void withdraw(){
        System.out.println("Enter Amount to Withdraw");
        double amt = sc.nextDouble();
        acc.withdraw(amt);

    }
}
public class ATMInterface {
    public static void main(String []args){
        System.out.println("Welcome To Our ATM Interface");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your PIN");
        int safepin = sc.nextInt();

        userbankacc uacc= new userbankacc(1000.0);
        ATMFun atmfun = new ATMFun(uacc);
        atmfun.run();
    }
}
