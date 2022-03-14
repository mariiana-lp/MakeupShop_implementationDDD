package co.com.sofka.domain.brand;

import co.com.sofka.domain.brand.value.DataProvaider;
import co.com.sofka.domain.brand.value.ProviderId;
import co.com.sofka.domain.generic.Entity;

public class Provider extends Entity<ProviderId> {
    private DataProvaider dataProvaider;

    public Provider(ProviderId entityId, DataProvaider dataProvaider) {
        super(entityId);
        this.dataProvaider = dataProvaider;
    }

    // TODO: 13/03/22 comportamientos


    public DataProvaider dataProvaider() {
        return dataProvaider;
    }
}
