package co.com.sofka.domain.brand;

import co.com.sofka.domain.brand.value.CategoryId;
import co.com.sofka.domain.brand.value.DataProduct;
import co.com.sofka.domain.brand.value.ProductId;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Identity;

public class Product extends Entity {
    private ProductId productId;
    private CategoryId categoryId;
    private DataProduct dataProduct;
    private boolean state;

    public Product(ProductId entityId,  CategoryId categoryId, DataProduct dataProduct, boolean state) {
        super(entityId);
        this.categoryId = categoryId;
        this.dataProduct = dataProduct;
        this.state = state;
    }

    // TODO: 13/03/22  comportamientos


    public ProductId productId() {
        return productId;
    }

    public CategoryId categoryId() {
        return categoryId;
    }

    public DataProduct dataProduct() {
        return dataProduct;
    }

    public boolean state() {
        return state;
    }
}
