package co.com.sofka.domain.franchise.events;

import co.com.sofka.domain.franchise.value.ContractId;
import co.com.sofka.domain.franchise.value.FranchiseId;
import co.com.sofka.domain.franchise.value.RepresentativeId;
import co.com.sofka.domain.generic.DomainEvent;

public class FranchiseCreated extends DomainEvent {
    private final ContractId contractId;
    private final RepresentativeId representativeId;

    public FranchiseCreated(ContractId contractId, RepresentativeId representativeId){
        super("franchise.franchiseCreated");
        this.contractId = contractId;
        this.representativeId = representativeId;
    }

    public ContractId getContractId() {
        return contractId;
    }

    public RepresentativeId getRepresentativeId() {
        return representativeId;
    }
}
