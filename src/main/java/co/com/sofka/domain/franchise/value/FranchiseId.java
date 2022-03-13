package co.com.sofka.domain.franchise.value;

import co.com.sofka.domain.franchise.Franchise;
import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.generic.ValueObject;

public class FranchiseId extends Identity {
    private FranchiseId(String value){
        super(value);
    }

    public FranchiseId(){}
    public static FranchiseId of(String value) {
        return new FranchiseId(value);
    }
}
