package co.com.sofka.domain.order;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.order.value.PaymentMethodId;
import co.com.sofka.domain.order.value.Price;
import co.com.sofka.domain.order.value.TypePaymentMethod;

import java.util.Set;

//entidad medio de pago para el agregado pedido
public class PaymentMethod extends Entity<PaymentMethodId> {
    private TypePaymentMethod typePaymentMethod;

    public PaymentMethod(PaymentMethodId entityId, TypePaymentMethod typePaymentMethod) {
        super(entityId);
        this.typePaymentMethod = typePaymentMethod;


    }

    //Comportamientos y eventos

    public void deletePaymentMethod(){

    }

    public void addPaymentMethod(){

    }

    public void updateState(){

    }

    public TypePaymentMethod typePaymentMethod() {
        return typePaymentMethod;
    }


}
