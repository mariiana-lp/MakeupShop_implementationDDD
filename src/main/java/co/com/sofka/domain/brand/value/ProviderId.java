package co.com.sofka.domain.brand.value;

import co.com.sofka.domain.generic.Identity;

public class ProviderId extends Identity {
    public ProviderId (){
    }
    private ProviderId (String id){
        super(id);
    }
    public static ProviderId of(String id){
        return new ProviderId(id);
    }
}
