package co.com.sofka.domain.store;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.store.value.ClientId;
import co.com.sofka.domain.store.value.DataPerson;
import co.com.sofka.domain.store.value.ID;
import co.com.sofka.domain.store.value.TypeClient;

public class Client extends Entity {
    private DataPerson dataPerson;
    private ID id;
    private TypeClient typeClient;

    public Client(ClientId clientId, DataPerson dataPerson, ID id) {
        super(clientId);
        this.dataPerson = dataPerson;
        this.id = id;

    }

    // TODO: 13/03/22 comportamientos
    public void clienteAntiguo (){
        this.typeClient = new TypeClient(TypeClient.Fase.ANTIGUO);
    }

    public DataPerson dataPerson() {
        return dataPerson;
    }

    public ID id() {
        return id;
    }

    public TypeClient typeClient() {
        return typeClient;
    }
}
