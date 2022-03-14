package co.com.sofka.domain.store.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.store.value.DataStore;

public class StoreCreated extends DomainEvent {
    private final DataStore dataStore;

    public StoreCreated(DataStore dataStore) {
        super("store.storeCreated");
        this.dataStore = dataStore;
    }

    public DataStore getDataStore() {
        return dataStore;
    }
}
