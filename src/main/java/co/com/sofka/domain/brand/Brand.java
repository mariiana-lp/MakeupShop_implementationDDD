package co.com.sofka.domain.brand;

import co.com.sofka.domain.brand.events.BrandCrated;
import co.com.sofka.domain.brand.value.BrandId;
import co.com.sofka.domain.brand.value.ProductId;
import co.com.sofka.domain.brand.value.ProviderId;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Set;

public class Brand extends AggregateEvent<BrandId> {
    protected ProviderId providerId;
    protected Set<ProductId> productIdLis;

    public Brand (BrandId brandId, ProviderId providerId){
        super(brandId);
        appendChange(new BrandCrated(providerId)).apply();
    }

    private Brand(BrandId brandId){
        super(brandId);
        subscribe(new BrandChange(this));
    }

    public ProviderId providerId() {
        return providerId;
    }

    public Set<ProductId> productIdLis() {
        return productIdLis;
    }
}
