package co.com.sofka.domain.store;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.store.value.DataPerson;
import co.com.sofka.domain.store.value.ID;
import co.com.sofka.domain.store.value.SellerId;

public class Seller extends Entity {

    private DataPerson dataPerson;
    private ID id;
    private boolean state;

    public Seller(SellerId entityId, DataPerson dataPerson, ID id, boolean state) {
        super(entityId);
        this.dataPerson = dataPerson;
        this.id = id;
        this.state = state;
    }

    // TODO: 13/03/22 comportamientos

    public DataPerson dataPerson() {
        return dataPerson;
    }

    public ID id() {
        return id;
    }

    public boolean state() {
        return state;
    }
}
