package br.com.codenation;

public class BillingProcessor {

    public Double calculate(Order order) {


        if(order.getPaymentMethod()!=null)
        return order.
                getPaymentMethod()
                .getPaymentStrategy()
                .calculate(order.getPrice());

        else
        throw new RuntimeException("Payment method not implemented");

    }
}

