package org.springcoreDemo;

import org.springcoreDemo.payment.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {


    private final PaymentService paymentService;

    public OrderService(@Qualifier("cp") PaymentService paymentService){
        this.paymentService = paymentService;
    }
//    @Autowired
//    public void setPaymentService(PaymentService paymentService){
//        this.paymentService = paymentService;
//    }

    public void placeOrder(){
        paymentService.pay();
        System.out.println("Order Placed");
    }
}
