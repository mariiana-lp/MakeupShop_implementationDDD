package co.com.sofka.domain.order.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.order.value.OrderId;
import co.com.sofka.domain.order.value.StateOrder;

public class CompletedOrder extends Command {
    private final OrderId orderId;
    private final StateOrder stateOrder;

    public CompletedOrder(OrderId orderId, StateOrder stateOrder){
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
