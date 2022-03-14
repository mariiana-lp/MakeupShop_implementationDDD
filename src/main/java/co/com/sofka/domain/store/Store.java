package co.com.sofka.domain.store;

import co.com.sofka.domain.brand.value.BrandId;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.store.events.StoreCreated;
import co.com.sofka.domain.store.value.*;

import java.util.List;
import java.util.Set;

public class Store extends AggregateEvent<StoreId> {
    protected List<ClientId> clients;
    protected List<BrandId> brandIds;
    protected List<SellerId> sellerIds;
    protected AdminId adminId;
    protected DataStore dataStore;

    public Store(StoreId storeId, DataStore dataStore) {
        super(storeId);
        appendChange(new StoreCreated(dataStore)).apply();
        subscribe(new StoreChange(this));
    }

    private Store(StoreId storeId) {
        super(storeId);
        subscribe(new StoreChange(this));
    }

    public static Store from(StoreId storeId, List<DomainEvent> events){
        var store = new Store(storeId);
        events.forEach(store::applyEvent);
        return store;
    }

    // TODO: 13/03/22 comportamientos


    public List<ClientId> clients() {
        return clients;
    }

    public List<BrandId> getBrandIds() {
        return brandIds;
    }

    public List<SellerId> getSellerIds() {
        return sellerIds;
    }

    public AdminId getAdminId() {
        return adminId;
    }

    public DataStore getDataStore() {
        return dataStore;
    }
}
