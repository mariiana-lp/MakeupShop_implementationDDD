package co.com.sofka.domain.store.value;

import co.com.sofka.domain.generic.Identity;

public class SellerId extends Identity {
    private SellerId(String value){
        super(value);
    }

    public SellerId(){}
    public static SellerId of(String value) {
        return new SellerId(value);
    }
}
