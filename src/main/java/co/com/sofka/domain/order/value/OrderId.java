package co.com.sofka.domain.order.value;

import co.com.sofka.domain.generic.Identity;

public class OrderId extends Identity {
    private OrderId(String value){
        super(value);
    }

    public OrderId(){}
    public static OrderId of(String value) {
        return new OrderId(value);
    }
}
