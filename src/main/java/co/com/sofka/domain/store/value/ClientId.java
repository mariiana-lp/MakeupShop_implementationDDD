package co.com.sofka.domain.store.value;

import co.com.sofka.domain.generic.Identity;

public class ClientId extends Identity {
    private ClientId(String value){
        super(value);
    }

    public ClientId(){}
    public static ClientId of(String value) {
        return new ClientId(value);
    }
}
