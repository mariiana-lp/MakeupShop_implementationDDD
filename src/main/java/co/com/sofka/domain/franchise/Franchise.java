package co.com.sofka.domain.franchise;

import co.com.sofka.domain.franchise.value.ContractId;
import co.com.sofka.domain.franchise.value.FranchiseId;
import co.com.sofka.domain.franchise.value.Name;
import co.com.sofka.domain.franchise.value.RepresentativeId;
import co.com.sofka.domain.generic.AggregateEvent;

//Agregado Franqucia
public class Franchise extends AggregateEvent<FranchiseId> {
    protected ContractId contractId;
    private RepresentativeId representativeId;
    //private final Set<TiendaId>
    protected Name name;

    public Franchise(FranchiseId franchiseId, ContractId contractId, RepresentativeId representativeId){
        super(franchiseId);

    }
}
