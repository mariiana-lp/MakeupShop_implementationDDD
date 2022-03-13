package co.com.sofka.domain.order;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.order.value.OrderId;

public class Order extends AggregateEvent<OrderId> {
    private OrderId orderId;

    public Order (OrderId orderId){
        super(orderId);
        this.orderId = orderId;
    }
}
