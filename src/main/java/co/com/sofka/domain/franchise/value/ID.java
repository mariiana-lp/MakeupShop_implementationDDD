package co.com.sofka.domain.franchise.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ID implements ValueObject<ID.Props> {
    private final String type;
    private final String number;
    private boolean state;

    public ID(String type, String number, boolean state){
        Objects.requireNonNull(this.type = type);
        Objects.requireNonNull(this.number = number);
        Objects.requireNonNull(this.state = state);

    }

    @Override
    public Props value(){
        return new Props() {
            @Override
            public String type() {
                return null;
            }

            @Override
            public String number() {
                return null;
            }

            @Override
            public boolean state() {
                return false;
            }
        };
    }

    public interface Props{
        String type();
        String number();
        boolean state();
    }
}
