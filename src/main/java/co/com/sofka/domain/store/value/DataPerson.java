package co.com.sofka.domain.store.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DataPerson implements ValueObject<DataPerson.Props> {
    private final String name;
    private final String lastName;
    private final String cellPhone;

    public DataPerson(String name, String lastName, String cellPhone){
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
