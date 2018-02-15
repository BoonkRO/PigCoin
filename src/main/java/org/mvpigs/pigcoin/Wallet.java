package org.mvpigs.pigcoin;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;


public class Wallet {
    private PublicKey address;
    private PrivateKey sKey;
    private double total_input;
    private double total_output;
    private int balance;
    private String inputTransactions;
    private String outputTransactions;

    /* Constructores */

    public Wallet(){

    }

    public Wallet (PublicKey address, PrivateKey sKey, double total_output, double total_input, int balance){
        this.address = address;
        this.sKey = sKey;
        this.total_input = total_input;
        this.total_output = total_output;
        this.balance = balance;
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
}
