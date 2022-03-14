package co.com.sofka.domain.order.value;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;

public class Date implements ValueObject<LocalDate> {
    private final LocalDate value;

    public Date(LocalDate value) {
        this.value = value;
    }

    public Date() {
        this(LocalDate.now());
    }

    @Override
    public LocalDate value(){
        return value;
    }


}
