package co.com.sofka.domain.store;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.store.value.StoreId;

public class Store extends AggregateEvent<StoreId> {
    private final StoreId storeId;

    public Store (StoreId storeId) {
        super(storeId);
        this.storeId = storeId;
    }
}
