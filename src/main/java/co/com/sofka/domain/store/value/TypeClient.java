package co.com.sofka.domain.store.value;

import co.com.sofka.domain.generic.ValueObject;

public class TypeClient implements ValueObject<TypeClient.Fase> {
    private final Fase value;

    public TypeClient(Fase value) {
        this.value = value;
    }
    @Override
    public Fase value() {
        return value;
    }

    public enum Fase {
        NUEVO, ANTIGUO
    }

}
