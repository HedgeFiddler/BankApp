package com.bank;

import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<User> users = new ArrayList();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void addUser(String password,
                        String name,
                        String address,
                        String phoneNumber,
                        String email,
                        String secretQuestion,
                        String answerToSecretQuestion
                        ){

        User newUser = new User(password, name, address, phoneNumber, email, secretQuestion, answerToSecretQuestion);
        users.add(newUser);

    }
    public void addUser(User user){
        users.add(user);
    }

    public double totalAmountOfUser(String userId){
        for (User user : users) {
            if(user.getId().equals(userId)){

              return  user.getAccountsBalance();
            }

        }

        return -1;
    }

    public void addMoneyToUser(String userId, long accountId, double amountOfMoney){
        for (User user : users){
            if(user.getId().equals(userId)){
                user.addMoney(accountId, amountOfMoney);
            }
        }
    }

    public String getBankName() {
        return bankName;
    }
}
