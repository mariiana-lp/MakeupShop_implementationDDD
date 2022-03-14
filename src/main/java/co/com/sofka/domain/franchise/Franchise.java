package co.com.sofka.domain.franchise;

import co.com.sofka.domain.franchise.events.FranchiseCreated;
import co.com.sofka.domain.franchise.value.ContractId;
import co.com.sofka.domain.franchise.value.FranchiseId;
import co.com.sofka.domain.franchise.value.Name;
import co.com.sofka.domain.franchise.value.RepresentativeId;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.order.value.OrderId;

import java.util.List;

//Agregado Franqucia
public class Franchise extends AggregateEvent<FranchiseId> {
    protected ContractId contractId;
    private RepresentativeId representativeId;
    //private final Set<TiendaId>
    protected Name name;

    public Franchise(FranchiseId franchiseId, ContractId contractId, RepresentativeId representativeId){
        super(franchiseId);
        appendChange(new FranchiseCreated(contractId, representativeId)).apply();
        subscribe(new FranchiseChange(this));

    }

    private Franchise(FranchiseId franchiseId){
        super(franchiseId);
        subscribe(new FranchiseChange(this));
    }

    public  static  Franchise from (FranchiseId franchiseId, List<DomainEvent> events){
        var franchise = new Franchise(franchiseId);
        events.forEach(franchise::applyEvent);
        return franchise;
    }

}
