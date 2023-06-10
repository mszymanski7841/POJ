package Zad2;

import java.util.Scanner;

public class MainBankException {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Do you want to create an account?");
        boolean doCreateAccount = getYesNoAnswer();
        if (!doCreateAccount) {
            endProgram();
        }
        Account account = null;
        try{
            account = createNewAccount();
        }catch(Exception e){
            System.out.println(e.getMessage());
            endProgram();
        }
        System.out.println("Do you want to withdraw money?");
        boolean shouldWithdrawMoney = getYesNoAnswer();
        if (!shouldWithdrawMoney) {
            endProgram();
        }
        System.out.println("How much do you want to withdraw?");
        int amount = getAmount();
        try{
            account.withdraw(amount);
            System.out.printf("Thank you for using our service. Your current balance is %.2f $", account.getBalance());
        }catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }


    }

    private static Account createNewAccount() throws Exception {
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        if(name.isEmpty()){
            throw new Exception("Name can't be empty!");
        }
        System.out.println("How much do you want to put down to your account?");
        int initialAmount = getAmount();
        return new Account(name, initialAmount);
    }

    private static int getAmount() {
        return Integer.parseInt(scanner.nextLine());
    }

    private static void endProgram() {
        System.out.println("Thank you for using our service!");
        System.exit(0);
    }

    private static boolean getYesNoAnswer() {
        String userAnswer = scanner.nextLine();
        if (userAnswer.toLowerCase().contains("y")) {
            return true;
        } else if (userAnswer.toLowerCase().contains("n")) {
            return false;
        } else {
            System.out.println("Please enter 'yes' or 'no'.");
            return getYesNoAnswer();
        }
    }
}
