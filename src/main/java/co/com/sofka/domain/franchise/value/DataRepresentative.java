package co.com.sofka.domain.franchise.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DataRepresentative implements ValueObject<DataRepresentative.Props> {
    private final String name;
    private final String lastName;
    private final String cellPhone;

    public DataRepresentative(String name, String lastName, String cellPhone){
        Objects.requireNonNull(this.name = name);
        Objects.requireNonNull(this.lastName = lastName);
        Objects.requireNonNull(this.cellPhone = cellPhone);
    }

    @Override
    public Props value(){
        return new Props() {
            @Override
            public String name() {
                return null;
            }

            @Override
            public String lastName() {
                return null;
            }

            @Override
            public String cellPhone() {
                return null;
            }
        };
    }

    public interface Props{
        String name();
        String lastName();
        String cellPhone();
    }

    @Override
    public String toString() {
        return "DataRepresentative{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cellPhone='" + cellPhone + '\'' +
                '}';
    }
}
