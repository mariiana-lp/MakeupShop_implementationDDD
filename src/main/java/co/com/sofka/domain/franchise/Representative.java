package co.com.sofka.domain.franchise;

import co.com.sofka.domain.franchise.value.DataRepresentative;
import co.com.sofka.domain.franchise.value.ID;
import co.com.sofka.domain.franchise.value.RepresentativeId;
import co.com.sofka.domain.generic.Entity;

public class Representative extends Entity {

    private DataRepresentative dataRepresentative;
    private ID id;

    public Representative(RepresentativeId representativeId, DataRepresentative dataRepresentative, ID id){
        super(representativeId);
        this.dataRepresentative = dataRepresentative;
        this.id = id;
    }

    // TODO: 13/03/22 Definir Comportamientos


    public DataRepresentative dataRepresentative() {
        return dataRepresentative;
    }

    public ID id() {
        return id;
    }
}
