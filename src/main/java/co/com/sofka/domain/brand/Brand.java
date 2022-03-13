package co.com.sofka.domain.brand;

import co.com.sofka.domain.brand.value.BrandId;
import co.com.sofka.domain.generic.AggregateEvent;

public class Brand extends AggregateEvent<BrandId> {
    private final BrandId brandId;

    public Brand (BrandId brandId){
        super(brandId);
        this.brandId = brandId;
    }
}
