package co.com.sofka.domain.store.value;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.util.Objects;

public class DataStore implements ValueObject<DataStore.Props> {
    private final String name;
    private final String city;
    private final String address;
    private final LocalDate openDate;
    private final LocalDate closeDate;

    public DataStore(String name, String  city, String address
    ,LocalDate openDate, LocalDate closeDate){
        Objects.requireNonNull(this.name = name);
        Objects.requireNonNull(this.city = city);
        Objects.requireNonNull(this.address = address);
        Objects.requireNonNull(this.openDate = openDate);
        Objects.requireNonNull(this.closeDate = closeDate);
    }

    @Override
    public Props value(){
        return new Props() {
            @Override
            public String name() {
                return null;
            }

            @Override
            public String city() {
                return null;
            }

            @Override
            public String address() {
                return null;
            }

            @Override
            public LocalDate openDate() {
                return null;
            }

            @Override
            public LocalDate closeDate() {
                return null;
            }
        };
    }

    public interface Props{
        String name();
        String city();
        String address();
        LocalDate openDate();
        LocalDate closeDate();
    }
}
