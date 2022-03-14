package co.com.sofka.domain.brand.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DataProvaider implements ValueObject<DataProvaider.Props> {
    private final String name;
    private final String location;


    public DataProvaider(String name, String location){
        Objects.requireNonNull(this.name = name);
        Objects.requireNonNull(this.location = location);
    }

    @Override
    public DataProvaider.Props value(){
        return new Props() {
            @Override
            public String name() {
                return null;
            }

            @Override
            public String location() {
                return null;
            }
        };
    }

    public interface Props{
        String name();
        String location();
    }

    @Override
    public String toString() {
        return "DataProvaider{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
