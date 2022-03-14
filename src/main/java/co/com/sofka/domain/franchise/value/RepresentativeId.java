package co.com.sofka.domain.franchise.value;

import co.com.sofka.domain.generic.Identity;

public class RepresentativeId extends Identity {
    private RepresentativeId(String valor){
        super(valor);
    }

    public RepresentativeId(){}

    public static RepresentativeId of(String valor){
        return new RepresentativeId(valor);
    }
}
