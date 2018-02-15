package org.mvpigs.pigcoin;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;


public class Wallet {
    private PublicKey address;
    private PrivateKey sKey;
    private double total_input = 0d;
    private double total_output = 0d;
    private double balance = 0d;
    private int inputTransactions = 0;
    private int outputTransactions = 0;

    /* Constructores */

    public Wallet(){

    }


    public Wallet (PublicKey address, PrivateKey sKey, double total_output, double total_input, double balance, int inputTransactions, int outputTransactions){
        this.address = address;
        this.sKey = sKey;
        this.total_input = total_input;
        this.total_output = total_output;
        this.balance = balance;
        this.inputTransactions = inputTransactions;
        this.outputTransactions = outputTransactions;
    }


    /* Encapsulación */

    public PublicKey getAddress() {
        return address;
    }

    public void setAddress(PublicKey address) {
        this.address = address;
    }


    public void setSK(PrivateKey sKey) {
        this.sKey = sKey;
    }

    public PrivateKey getsKey() {
        return sKey;
    }

    public void generateKeyPair(){
        KeyPair par = GenSig.generateKeyPair();
        setSK(par.getPrivate());
        setAddress(par.getPublic());
    }

    public double getTotal_input() {
        return total_input;
    }

    public double getTotal_output() {
        return total_output;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString(){
        return "\n Wallet = " + getAddress().hashCode() + "\n Total input = "  + total_input + "\n Total output = " + total_output + "\n Balance = " + balance + "\n";
    }
}
