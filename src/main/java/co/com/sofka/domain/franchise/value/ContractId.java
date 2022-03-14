package co.com.sofka.domain.franchise.value;

import co.com.sofka.domain.generic.Identity;

public class ContractId extends Identity {
    private ContractId(String valor){
        super(valor);
    }

    public ContractId(){}

    public static ContractId of(String valor){
        return new ContractId(valor);
    }
}
