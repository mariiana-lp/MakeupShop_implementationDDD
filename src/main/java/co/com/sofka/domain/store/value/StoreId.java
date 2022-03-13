package co.com.sofka.domain.store.value;

import co.com.sofka.domain.generic.Identity;

public class StoreId extends Identity {
    private StoreId(String value){
        super(value);
    }

    public StoreId(){}
    public static StoreId of(String value) {
        return new StoreId(value);
    }
}
