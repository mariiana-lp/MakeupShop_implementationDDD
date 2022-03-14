package co.com.sofka.domain.brand.events;

import co.com.sofka.domain.brand.value.ProviderId;
import co.com.sofka.domain.generic.DomainEvent;

public class BrandCrated extends DomainEvent {
    private final ProviderId providerId;

    public BrandCrated (ProviderId providerId){
        super("brand.brandCreate");
        this.providerId = providerId;
    }

    public ProviderId providerId(){
        return providerId;
    }
}
