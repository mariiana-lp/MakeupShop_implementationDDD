package co.com.sofka.domain.order.value;

import co.com.sofka.domain.generic.ValueObject;

//Objeto de valor Estado del agregado Pedido
public class StateOrder implements ValueObject<StateOrder.Fase> {
    private final Fase value;

    public StateOrder(Fase value){
        this.value = value;
    }

    @Override
    public Fase value() {
        return value;
    }

    public enum Fase {
        ENTREGADO, PENDIENTE
    }
}
