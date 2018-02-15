package org.mvpigs.pigcoin;

import java.security.PublicKey;

public class Transaction {

    private String hash;
    private String prev_hash;
    private PublicKey pKey_sender;
    private PublicKey pKey_recipient;
    private int pigcoins;
    private String message;
    private byte[] signature;

    public Transaction(){

    }

    public Transaction(String hash, String prev_hash, PublicKey pKey_sender, PublicKey pKey_recipient, int pigcoins, String message){
        this.hash = hash;
        this.prev_hash = prev_hash;
        this.pKey_sender = pKey_sender;
        this.pKey_recipient = pKey_recipient;
        this.pigcoins = pigcoins;
        this.message = message;
    }

    /* Encapsulacion */

    public String getHash() {
        return hash;
    }

    public String getPrev_hash() {
        return prev_hash;
    }

    public PublicKey getpKey_sender() {
        return pKey_sender;
    }


    public PublicKey getpKey_recipient() {
        return pKey_recipient;
    }

    public int getPigcoins() {
        return pigcoins;
    }


    public String getMessage() {
        return message;
    }



}
