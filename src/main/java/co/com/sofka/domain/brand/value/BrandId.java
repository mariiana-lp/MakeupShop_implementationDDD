package co.com.sofka.domain.brand.value;

import co.com.sofka.domain.generic.Identity;

public class BrandId extends Identity {
    private BrandId(String value){
        super(value);
    }

    public BrandId(){}
    public static BrandId of(String value) {
        return new BrandId(value);
    }
}
