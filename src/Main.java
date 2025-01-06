//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your balance");
        float balance = sc.nextFloat();
        boolean isdone = false;
        while (!isdone) {
            System.out.println("1.Deposit\n2.Withdrawl\n3.Check the balance\n4.Loan Offers\n5.Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    //Depositing the money on account
                    System.out.println("Deposition");
                    System.out.println("Enter the deposit money");
                    float deposit = sc.nextFloat();
                    System.out.println("Your account balance after deposition is: " + (balance + deposit));
                    break;
                } case 2: {
                    //Withdrawing the money from account
                    System.out.println("Withdrawal");
                    System.out.println("Enter the money that has to be withdrawn");
                    float withdrawal = sc.nextFloat();
                    if (withdrawal >= balance) {
                        System.out.println("You cannot withdraw");
                    } else {
                        System.out.println("Your account balance after withdrawal is: " + (balance - withdrawal));
                    }
                    break;
                }
                case 3: {
                    //Checking the account balance
                    System.out.println("Check Balance");
                    System.out.println("Your account balance is: " + balance);
                    break;
                }
                case 4: {
                    //Suggesting different Loan Offers
                    System.out.println("Loan Offers");
                    System.out.println("1.Education Loan\n2.Home Loan\n3.Personal Loan\n4.Agricultural Loan");
                    System.out.println("Enter your loan choice");
                    int loan = sc.nextInt();
                    switch (loan) {
                        case 1: {
                            System.out.println("Thank you for applying Education Loan,We will contact you soon");
                            break;
                        }
                        case 2: {
                            System.out.println("Thank you for applying Home Loan,We will contact you soon");
                            break;
                        }
                        case 3: {
                            System.out.println("Thank you for applying Personal Loan,We will contact you soon");
                            break;
                        }
                        case 4: {
                            System.out.println("Thank you for applying Agricultural Loan,We will contact you soon");
                            break;
                        }
                    }
                    break;
                }
                case 5: {
                    System.out.println("Exit");
                    break;
                }
            }
            System.out.println("Do you want to perform further operations?");
            isdone = sc.nextBoolean();
        }
        System.out.println("Thank you,Visit again!");
    }
}

