package com.jju;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<PaymentMethod> payments = new ArrayList<>();

        payments.add(new CreditCard("9876-5432-1111-2222"));
        payments.add(new PayPal("melischalie1@gmail.com"));

        for (PaymentMethod payment : payments) {
            payment.processPayment(99.99);
        }
    }
}