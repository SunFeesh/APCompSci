import java.util.Scanner;
import java.text.NumberFormat;

public class ChargeAccount {

public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    NumberFormat money = NumberFormat.getCurrencyInstance();
    
    Double oldBalance, addCharge, interest, interestRate, newBalance, payment;
    
    System.out.print("Previous Amount? ");
    oldBalance = input.nextDouble();    
    System.out.print("Additional Charges? ");
    addCharge = input.nextDouble();
    
    //Interest
    if (oldBalance == 0){
        interestRate = 0.0;
    } else {
        interestRate = .02;
    }
    //
    
    interest = interestRate * oldBalance;
    newBalance = oldBalance + addCharge + interest;
    
    //Minimum Payment
    if (newBalance < 50) {
        payment = newBalance;
    } else if (newBalance >= 50 && newBalance <= 300) {
        payment = 50.0;
    } else {
        payment = newBalance * .2;
    }



    
    System.out.println();
    System.out.println("CS CARD International Statement");
    System.out.println("===============================");
    System.out.println("Previous Balance:\t" + money.format(oldBalance));
    System.out.println("Additional Charges:\t" + money.format(addCharge));
    System.out.println("Interest:\t\t" + money.format(interest));
    System.out.println("New Balance:\t\t" + money.format(newBalance));
    System.out.println();
    System.out.println("Minimum Payment:\t" + money.format(payment));
    
    input.close();   
    }

}
