package co.com.sofka.domain.order;

import co.com.sofka.domain.brand.Product;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.order.events.AddedProduct;
import co.com.sofka.domain.order.events.CompletedOrder;
import co.com.sofka.domain.order.events.OrderCreated;
import co.com.sofka.domain.order.events.OrderRemoved;
import co.com.sofka.domain.order.value.InvoiceId;
import co.com.sofka.domain.order.value.OrderId;
import co.com.sofka.domain.order.value.StateOrder;

import java.util.List;
import java.util.Set;

public class Order extends AggregateEvent<OrderId> {
    protected OrderId orderId;
    protected InvoiceId invoiceId;
    protected Set<Product> products;
    protected StateOrder stateOrder;

    public Order(OrderId orderId, StateOrder stateOrder){
        super(orderId);
        appendChange(new OrderCreated(stateOrder)).apply();
    }

    public  static Order from (OrderId personaId, List<DomainEvent> events){
        var order = new Order(personaId);
        events.forEach(order::applyEvent);
        return order;
    }

    private Order (OrderId orderId){
        super(orderId);
        // TODO: 13/03/22
        subscribe(new OrderChange(this));
    }

    //comportamientos

    public void deleteOrder(OrderId orderId){
        appendChange(new OrderRemoved(orderId)).apply();
    }

    public void completeOrder(OrderId orderId, StateOrder stateOrder ){
        appendChange(new CompletedOrder(orderId, stateOrder)).apply();
    }
    
    public void addProduct(OrderId orderId,Product product){
        // TODO: 13/03/22
        //appendChange(new AddedProduct(orderId, product)).apply();
    }

    // TODO: 13/03/22 definir comportamientos

    public OrderId orderId() {
        return orderId;
    }

    public InvoiceId invoiceId() {
        return invoiceId;
    }

    public Set<Product> products() {
        return products;
    }

    public StateOrder stateOrder() {
        return stateOrder;
    }
}
