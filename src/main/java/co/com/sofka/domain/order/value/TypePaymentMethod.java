package co.com.sofka.domain.order.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TypePaymentMethod implements ValueObject<TypePaymentMethod.Props> {
    private final String name;
    private final String description;
    private final boolean state;

    public TypePaymentMethod(String name, String description){
        Objects.requireNonNull(this.name = name);
        Objects.requireNonNull(this.description = description);
        this.state=true;

    }

    @Override
    public Props value(){
        return new Props(){
            @Override
            public String name() {
                return name;
            }

            @Override
            public String description() {
                return description;
            }

            @Override
            public boolean state(){return state;}
        };

    }

    public String description(){
        return description;
    }

    public String name() {
        return name;
    }

    public boolean state() {
        return state;
    }

    public interface Props{
        String name();
        String description();
        boolean state();

    }

    @Override
    public String toString() {
        return "TypePaymentMethod{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", state=" + state +
                '}';
    }
}
