package com.company;

public class Main {
    public static void main(String[] args) {
        //HazardPay amount = new HazardPay();
       // System.out.println(amount.computePay(20));

       //  BulkDiscount myDiscount = new BulkDiscount(5,5);
       // System.out.println(myDiscount.computeDiscount(5,12));

        SubstitutionCipher myString = new SubstitutionCipher(5);
        System.out.println(myString.encode("saneen"));
    }
}
