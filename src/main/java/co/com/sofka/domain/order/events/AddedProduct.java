package co.com.sofka.domain.order.events;

import co.com.sofka.domain.brand.Product;
import co.com.sofka.domain.brand.value.ProductId;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.order.value.OrderId;

public class AddedProduct extends DomainEvent {
    private final ProductId productId;

    public AddedProduct(ProductId productId){
        super("sofka.order.addProduct");
        this.productId = productId;
    }

    public ProductId getProductId() {
        return productId;
    }
}
