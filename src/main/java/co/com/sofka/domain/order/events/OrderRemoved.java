package co.com.sofka.domain.order.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.order.value.OrderId;

public class OrderRemoved extends DomainEvent {
    private final OrderId orderId;

    public OrderRemoved(OrderId orderId){
        super("sofka.order.deleteOrder");
        this.orderId = orderId;
    }

    public OrderId getOrderId() {
        return orderId;
    }
}
