package co.com.sofka.domain.store;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.store.value.AdminId;
import co.com.sofka.domain.store.value.DataPerson;
import co.com.sofka.domain.store.value.ID;

public class Admin extends Entity {

    private DataPerson dataPerson;
    private ID id;

    public Admin(AdminId entityId, DataPerson dataPerson, ID id) {
        super(entityId);
        this.dataPerson = dataPerson;
        this.id = id;
    }

    // TODO: 13/03/22 comportamientos

    public DataPerson dataPerson() {
        return dataPerson;
    }

    public ID id() {
        return id;
    }

}
