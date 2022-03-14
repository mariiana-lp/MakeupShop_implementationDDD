package co.com.sofka.domain.order.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.order.value.OrderId;
import co.com.sofka.domain.order.value.StateOrder;

public class OrderCreated extends DomainEvent {
    private final OrderId orderId;
    private final StateOrder stateOrder;

    public OrderCreated(OrderId orderId, StateOrder stateOrder){
        super("sofka.order.orderCreated");
        this.orderId = orderId;
        this.stateOrder = stateOrder;
    }

    public OrderId getOrderId() {
        return orderId;
    }

    public StateOrder getStateOrder() {
        return stateOrder;
    }
}
