package co.com.sofka.domain.franchise;

import co.com.sofka.domain.franchise.value.ContractId;
import co.com.sofka.domain.franchise.value.DataContract;
import co.com.sofka.domain.generic.Entity;

public class Contract extends Entity {
    private DataContract dataContract;

    public Contract(ContractId contractId, DataContract dataContract){
        super(contractId);
        this.dataContract = dataContract;
    }

    public DataContract dataContract() {
        return dataContract;
    }

    // TODO: 13/03/22 Definir comportamientos
}
