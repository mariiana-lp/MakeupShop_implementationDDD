package co.com.sofka.domain.order.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.order.value.OrderId;
import co.com.sofka.domain.order.value.StateOrder;

public class OrderCreated extends DomainEvent {
    private final StateOrder stateOrder;

    public OrderCreated(StateOrder stateOrder){
        super("sofka.order.orderCreated");

        this.stateOrder = stateOrder;
    }

    public StateOrder getStateOrder() {
        return stateOrder;
    }
}
