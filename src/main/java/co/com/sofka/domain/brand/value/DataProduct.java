package co.com.sofka.domain.brand.value;

import co.com.sofka.domain.franchise.value.DataRepresentative;
import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DataProduct implements ValueObject<DataProduct.Props> {
    private final String name;
    private final String description;
    private final String expDate;

    public DataProduct(String name, String description, String expDate){
        Objects.requireNonNull(this.name = name);
        Objects.requireNonNull(this.description = description);
        Objects.requireNonNull(this.expDate = expDate);
    }

    @Override
    public DataProduct.Props value(){
       return new Props() {
           @Override
           public String name() {
               return null;
           }

           @Override
           public String description() {
               return null;
           }

           @Override
           public String expDate() {
               return null;
           }
       };
    }

    public interface Props{
        String name();
        String description();
        String expDate();
    }

    @Override
    public String toString() {
        return "DataProduct{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", expDate='" + expDate + '\'' +
                '}';
    }
}
