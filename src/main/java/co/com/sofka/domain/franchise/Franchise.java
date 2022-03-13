package co.com.sofka.domain.franchise;

import co.com.sofka.domain.franchise.value.FranchiseId;
import co.com.sofka.domain.generic.AggregateEvent;

//Agregado Franqucia
public class Franchise extends AggregateEvent<FranchiseId> {
    private final FranchiseId franchiseId;

    public Franchise(FranchiseId franchiseId){
        super(franchiseId);
        this.franchiseId = franchiseId;
    }
}
