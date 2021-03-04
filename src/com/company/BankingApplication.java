package com.company;

public class BankingApplication {
    public static void main(String[] args) {

    }
}
class BankAccount{
    int balance,previousTransaction;//余额,前一笔交易
    String customerName,customerId;//客户名称、客户id
    void deposit(int amount){
        if(amount!=0){
            balance=balance+amount;
            previousTransaction=amount;

        }
    }
    void withdraw(int amount){
        if(amount!=0){
            balance=balance-amount;
            previousTransaction=-amount;
        }
    }
    void getPreviousTransaction(){
        if(previousTransaction>0){
            System.out.println("Deposited"+previousTransaction);
        }
        else if (previousTransaction<0){
            System.out.println("提取"+Math.abs(previousTransaction));
        }else {
            System.out.println("没有交易发生");
        }
    }
    void showMenu(){

    }
}
