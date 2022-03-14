package co.com.sofka.domain.store.value;

import co.com.sofka.domain.generic.Identity;

public class AdminId extends Identity {
    private AdminId(String value){
        super(value);
    }

    public AdminId(){}
    public static AdminId of(String value) {
        return new AdminId(value);
    }
}
