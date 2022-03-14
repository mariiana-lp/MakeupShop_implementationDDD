package co.com.sofka.domain.order;

import co.com.sofka.domain.brand.Product;
import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.domain.order.commands.CompletedOrder;
import co.com.sofka.domain.order.events.AddedProduct;
import co.com.sofka.domain.order.events.OrderCreated;
import co.com.sofka.domain.order.events.OrderRemoved;

public class OrderChange extends EventChange {

    public OrderChange (Order order){
        /*apply((CompletedOrder event) -> {
            order.stateOrder = event.getStateOrder();
        });*/

        apply((AddedProduct event) ->{
            var numProducts= order.products().size();
            if (numProducts == 6){
                throw new IllegalArgumentException("No puedes agregar mas productos");
            }
            //order.products.add(new Product()); // TODO: 13/03/22
        });

    }

}
